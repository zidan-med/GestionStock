package org.jobs.metier;


import org.jobs.entities.Competence;
import org.jobs.entities.Experience;
import org.jobs.entities.Formation;
import org.jobs.entities.Langue;

import java.util.List;

public interface CandidatMetier {
    public void createLangue(Langue langue);

    public void updateLangue(Long langue_id,Langue langue);

    public void deleteLangue(Long langue_id);

    public List<Langue> getAllLangueByCandidate();

    public void createFormation(Formation formation);

    public void updateFormation(Long formation_id,Formation formation);

    public void deleteFormation(Long formation_id);

    public List<Formation> getAllFormationByCandidate();

    public void createComptence(Competence comptence);

    public void updateComptence(Long competence_id,Competence competence);

    public void deleteComptence(Long competence_id);

    public List<Competence> getAllComptenceByCandidat();

    public void createExperience(Experience experience);

    public void updateExperience(Long experience_id,Experience experience);

    public void deleteExperience(Long experience_id);

    public List<Experience> getAllExperienceByCandidate();





}
