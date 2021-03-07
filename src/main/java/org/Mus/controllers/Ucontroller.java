package org.Mus.controllers;

import org.Mus.entities.*;
import org.Mus.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Ucontroller {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("")
	public String viewHomePage(){
		return "index";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());
		return "signup_form";
	}
	//handling part
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		repo.save(user);
		return "Registration_succed";
	}

	@GetMapping("/RecruiterProfile")
	public String showRecruiter(Model model) {
		model.addAttribute("recruiter", new Recruiter());
		return "recruiter/RecruiterProfile";
	}
	@GetMapping("/CandidatProfile")
	public String showCandidat(Model model) {
		model.addAttribute("candidat", new Candidat());
		return "candidat/CandidatProfile";
	}













}
