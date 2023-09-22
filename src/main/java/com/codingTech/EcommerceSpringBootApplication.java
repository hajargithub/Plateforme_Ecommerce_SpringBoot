package com.codingTech;

import com.codingTech.Service.IUserService;
import com.codingTech.Service.UserService;
import com.codingTech.entity.Role;
import com.codingTech.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceSpringBootApplication.class, args);}


}
