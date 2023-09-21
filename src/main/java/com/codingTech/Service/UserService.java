package com.codingTech.service;

import com.codingTech.repository.UserRepository;
import com.codingTech.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository repository;
    public User chercherParEmail(String email)
    {
        return repository.findByEmail(email);
    }


}
