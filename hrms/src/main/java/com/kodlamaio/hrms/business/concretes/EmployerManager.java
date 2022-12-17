package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployerRepository;
import com.kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerRepository employerRepository;

	public EmployerManager(EmployerRepository employerRepository) {
		super();
		this.employerRepository = employerRepository;
	}

	@Override
	public DataResult<List<Employer>> getAllEmployer() {
		 return new SuccessDataResult<List<Employer>>
		 (this.employerRepository.findAll(),"Çalışanlar listelendi.");
	}
}
