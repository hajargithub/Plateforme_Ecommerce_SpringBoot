package com.codingTech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthentificationController {
	@RequestMapping("/Login")
	public String afficherLogin() {
		return "Login";
		
	}
//	@RequestMapping("/logout")
//	public String logout() {
//		return "logout";
//	}
	@RequestMapping("/admin/bonjour")
	public String afficher() {
		return "adminBonjour";
		
	}
	@RequestMapping("/user/bonjour")
	public String afficher1() {
		return "userBonjour";
		
	}
	@RequestMapping("/home")
	public String afficherAll() {
		return "index";
		
	}
}