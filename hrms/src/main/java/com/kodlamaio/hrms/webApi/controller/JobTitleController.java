package com.kodlamaio.hrms.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobTitleService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleController {
	
	private JobTitleService jobTitleService;

	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping
	public DataResult<List<JobTitle>> getAllJobTitle(){
		return jobTitleService.getAllJobTtile();
	}
	
	@PostMapping("/add")
	 public Result addJobTitle(@RequestBody JobTitle jobTitle) {
		return jobTitleService.addJobTitle(jobTitle);
	}
}
