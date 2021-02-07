package org.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ucontroller {
	
	@Autowired
	private userRepository repo;
	
	@GetMapping("")
	public String viewHomePage(){
		return "index";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new user());
		return "signup_form";
	}
	
	//handling part
	@PostMapping("/process_register")
	public String processRegistration(user user) {
		repo.save(user);
		return "Registration_succed";
	}

}
