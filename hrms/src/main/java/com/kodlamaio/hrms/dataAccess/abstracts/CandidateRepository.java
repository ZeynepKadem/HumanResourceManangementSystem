package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

	
}
