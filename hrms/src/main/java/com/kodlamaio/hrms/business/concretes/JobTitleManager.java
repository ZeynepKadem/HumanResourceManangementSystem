package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.JobTitleService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.ErrorResult;
import com.kodlamaio.hrms.core.utilites.results.Result;
import com.kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilites.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.JobTitleRepository;
import com.kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleRepository jobTitleRepository;
	

	public JobTitleManager(JobTitleRepository jobTitleRepository) {
		super();
		this.jobTitleRepository = jobTitleRepository;
	}


	@Override
	public DataResult<List<JobTitle>> getAllJobTtile() {
		
		return new SuccessDataResult<List<JobTitle>>
		(this.jobTitleRepository.findAll(),"İş başlıkları eklendi.");
	}

	public Result isJobTitleExist(String title) {
		if(this.jobTitleRepository.findByTitle(title)==null) {
			return new SuccessResult();
		}else {
			return new ErrorResult();
		}
	}

	@Override
	public Result addJobTitle(JobTitle title) {
		if(isJobTitleExist(title.getTitle()).isSuccess()) {
			this.jobTitleRepository.save(title);
			return new SuccessResult("İş pozisyonu başarıyla eklendi." + title.getTitle());
		}else {
			return new ErrorResult("Bu iş pozisyonu zaten mevcut!" + title.getTitle());
		}

	}
	}
