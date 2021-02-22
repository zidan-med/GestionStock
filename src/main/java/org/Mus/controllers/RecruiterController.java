package org.Mus.controllers;

import org.Mus.Repository.RecruiterRepository;
import org.Mus.entities.Recruiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RecruiterController {

	@Autowired
	private RecruiterRepository recruiterRepository;
	
	 
	@PostMapping("/save_recruiter")
	public String saveRecruiter( Recruiter recruiter) {
		recruiterRepository.save(recruiter);
		return "index";
	}
}
