package com.kodlamaio.hrms.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.CandidateService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Candidate;


@RestController
@RequestMapping("/candidates")
public class CandidateController {
	private CandidateService candidateService;

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping
	public DataResult<List<Candidate>> getAllCandidate() {
		return candidateService.getAllCandidate();
		
	}
}
