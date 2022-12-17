package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleService {

	DataResult<List<JobTitle>> getAllJobTtile();


	Result addJobTitle(JobTitle jobTitle);

}
