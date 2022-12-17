package com.kodlamaio.hrms.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/employers")
public class EmployerController {

	private EmployerService employerService;

	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping
	public DataResult<List<Employer>>getAllEmployer(){
		return employerService.getAllEmployer();
	}
}
