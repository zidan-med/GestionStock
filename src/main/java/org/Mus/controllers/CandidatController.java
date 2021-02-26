package org.Mus.controllers;


import org.Mus.Repository.CandidatRepository;
import org.Mus.entities.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatController {

    @Autowired
    private CandidatRepository candidatRepository;


    @PostMapping("/save_candidat")
    public String addCandidat(Candidat candidat) {
        candidatRepository.save(candidat);
        return "index";
    }
}