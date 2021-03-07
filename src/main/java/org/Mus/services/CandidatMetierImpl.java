package org.jobs.metier;

import org.jobs.dao.*;
import org.jobs.entities.Competence;
import org.jobs.entities.Experience;
import org.jobs.entities.Formation;
import org.jobs.entities.Langue;

import java.util.List;


public class CandidatMetierImpl implements CandidatMetier {

    CandidatRepository candidatRepository;
    CompetenceRepository competenceRepository;
    FormationRepository formationRepository;
    ExperienceRepository experienceRepository;
    LangueRepository langueRepository;


    @Override
    public void createLangue(Langue langue) {
        langueRepository.save(langue);

    }

    @Override
    public void updateLangue(Long langue_id, Langue langue) {
        langueRepository.save(langue);
    }

    @Override
    public void deleteLangue(Long langue_id) {
        langueRepository.deleteById(langue_id);

    }

    @Override
    public List<Langue> getAllLangueByCandidate() {

        return langueRepository.findAll();
    }

    @Override
    public void createFormation(Formation formation) {
        formationRepository.save(formation);

    }

    @Override
    public void updateFormation(Long formation_id, Formation formation) {
        formationRepository.save(formation);

    }

    @Override
    public void deleteFormation(Long formation_id) {
        formationRepository.deleteById(formation_id);

    }

    @Override
    public List<Formation> getAllFormationByCandidate() {
        return formationRepository.findAll();
    }

    @Override
    public void createComptence(Competence comptence) {
        competenceRepository.save(comptence);

    }

    @Override
    public void updateComptence(Long competence_id, Competence competence) {

    }

    @Override
    public void deleteComptence(Long competence_id) {

    }

    @Override
    public List<Competence> getAllComptenceByCandidat() {
        return null;
    }

    @Override
    public void createExperience(Experience experience) {

    }

    @Override
    public void updateExperience(Long experience_id, Experience experience) {

    }

    @Override
    public void deleteExperience(Long experience_id) {

    }

    @Override
    public List<Experience> getAllExperienceByCandidate() {
        return null;
    }
}
