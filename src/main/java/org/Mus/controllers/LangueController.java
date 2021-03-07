package org.Mus.controllers;


import org.Mus.Repository.*;
import org.Mus.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CandidatController {

    @Autowired
    private CandidatRepository candidatRepository;
    private FormationRepository formationtRepository;
    private ExperienceRepository experienceRepository;
    private LangueRepository langueRepository;
    private CompetenceRepository competenceRepository;



    @PostMapping("/save_profile")
    public String addProfile(@Valid Candidat candidat, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){return "candidat/CandidatProfile";}
        candidatRepository.save(candidat);
        return "candidat/CandidatFormations";
    }
    @PostMapping("/save_formation")
    public String addFormation(@Valid Formation formation, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){return "candidat/CandidatFormations";}
        formationtRepository.save(formation);
        return "candidat/CandidatExperiences";
    }
    @PostMapping("/save_experience")
    public String addExperience(@Valid Experience experience, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){return "candidat/CandidatExperiences";}
        experienceRepository.save(experience);
        return "candidat/CandidatCompetences";
    }
    @PostMapping("/save_competence")
    public String addCompetence(@Valid Competence competence, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){return "candidat/CandidatCompetences";}
        competenceRepository.save(competence);
        return "candidat/CandidatLangues";
    }
    @PostMapping("/save_langue")
    public String addLangue(@Valid Langue langue, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){return "candidat/CandidatLangues";}
        langueRepository.save(langue);
        return "candidat/CandidatProfile";
    }

}