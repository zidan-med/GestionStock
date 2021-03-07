package org.Mus.Repository;


import org.Mus.entities.Candidat;
import org.Mus.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation,Long> {


}
