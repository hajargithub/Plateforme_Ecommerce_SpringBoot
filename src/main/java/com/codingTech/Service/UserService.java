package com.codingTech.Service;

import com.codingTech.Repository.RoleRepository;
import com.codingTech.Repository.UserRepository;
import com.codingTech.entity.Role;
import com.codingTech.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;




    @Transactional
    public User ajouterUser(User u ) {
        System.out.println(u);
        User user = chercherParEmail(u.getEmail());
        if (user!= null) {
            System.out.println("L'e-mail existe déjà. Veuillez utiliser un autre e-mail.");
        }
      Role role= roleRepository.findByNomRole("USER");

            u.setRole(role);
            String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
           return repository.save(u);

    }
    public User chercherParEmail(String email)
    {
        return repository.findByEmail(email);
    }


}
