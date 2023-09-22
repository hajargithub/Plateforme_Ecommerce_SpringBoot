package com.codingTech.controller;

import com.codingTech.Service.IUserService;
import com.codingTech.Service.UserService;
import com.codingTech.entity.Role;
import com.codingTech.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthentificationController {

	@Autowired
	IUserService userService;

	@RequestMapping("/Login")
	public String afficherLogin() {
		System.out.println("login");
		return "Login";

	}

	@GetMapping("/Signup")
	public String showSignupForm(Model model) {
		User user = new User(); // Create a new User object
		model.addAttribute("user", user); // Add it to the model
		return "signup"; // Return the view name
	}


	@PostMapping ("/Signup2")
	public String SignUp2(@ModelAttribute("user") User user){
		System.out.println(user.getEmail());

		userService.ajouterUser(user );
		return "redirect:/home";


	}


//	@RequestMapping("/logout")
//	public String logout() {
//		return "logout";
//	}

    /*@GetMapping("/test")
	public void testintg(){
		User u=new User();
		u.setEmail("user@gmail.com");
		u.setPassword(by.encode("1234"));
		u.setRole(new Role("USER"));
		ser.ajouter(u);



	}*/


	@RequestMapping("/admin/bonjour")
	public String afficher() {
		return "adminUser";

	}

	@RequestMapping("/user/bonjour")
	public String afficher1() {
		return "useBonjour";

	}

	@RequestMapping("/home")
	public String afficherAll() {
		return "index";

	}
}