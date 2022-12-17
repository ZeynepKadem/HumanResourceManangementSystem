package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.CandidateService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.CandidateRepository;
import com.kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateRepository candidateRepository;

	public CandidateManager(CandidateRepository candidateRepository) {
		super();
		this.candidateRepository = candidateRepository;
	}

	@Override
	public DataResult<List<Candidate>> getAllCandidate() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateRepository.findAll(),"İş arayanlar listelendi.");
	}
}
