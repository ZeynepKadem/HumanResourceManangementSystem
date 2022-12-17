package com.kodlamaio.hrms.mailValidation.abstracts;

import com.kodlamaio.hrms.core.utilites.results.Result;

public interface MailValidationService {

	public Result sendMail(String email , String message);
}
