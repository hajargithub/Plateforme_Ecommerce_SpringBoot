package com.codingTech.service;

import com.codingTech.entity.Role;
import com.codingTech.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustemUserDetailService implements UserDetailsService {

    @Autowired
    IUserService userService;
    @Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user=userService.chercherParEmail(email);
		
		if(user==null)
		{
			throw new UsernameNotFoundException(email);
		}
		
		List<GrantedAuthority> authorities=getGrantedAuthority(user);
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),authorities);
		
		

	}
	
	private List<GrantedAuthority> getGrantedAuthority(User u)
	{
		List<GrantedAuthority> liste= new ArrayList<>();
		
			liste.add(new SimpleGrantedAuthority(u.getRole().getNomRole()));
		
		
		return liste;
		
	}

}

//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//
//        com.codingTech.entity.User user = userService.chercherParEmail(email);
//
//        if(user==null)
//        {
//            throw new UsernameNotFoundException(email);
//        }
//
//        List<GrantedAuthority> authorities=getGrantedAuthority(user);
//
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),authorities);
//
//
//
//    }
//
//    private List<GrantedAuthority> getGrantedAuthority(com.codingTech.entity.User u)
//    {
//        List<GrantedAuthority> liste= new ArrayList<>();
//        List<Role> roles=u.getRole();
//        for(Role r:roles)
//        {
//            liste.add(new SimpleGrantedAuthority(r.getNomRole()));
//        }
//
//        return liste;
//
//    }

