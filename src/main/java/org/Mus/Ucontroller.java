package org.Mus;

import org.Mus.entities.Recruiter;
import org.Mus.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping("/RecruiterProfile")
	public String showRecruiter(Model model) {
		model.addAttribute("recruiter", new Recruiter());
		return "recruiter/RecruiterProfile";
	}
	
	//handling part
	@PostMapping("/process_register")
	public String processRegistration(user user) {
		repo.save(user);
		return "Registration_succed";
	}

}
