package org.Mus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.Mus.entities.Recruiter;

@Repository
@Service
public interface RecruiterRepository extends JpaRepository<Recruiter, Long> { }

