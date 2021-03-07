package org.Mus.controllers;

import org.Mus.Repository.RecruiterRepository;
import org.Mus.entities.Recruiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class RecruiterController {

	@Autowired
	private RecruiterRepository recruiterRepository;
	
	 
	@PostMapping("/save_recruiter")
	public String saveRecruiter( @RequestBody Recruiter recruiter) {
		recruiterRepository.save(recruiter);
		return "index";
	}
}
