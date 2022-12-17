package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Integer> {

	

}
