package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer>{

	JobTitle findByTitle(String title);


}
