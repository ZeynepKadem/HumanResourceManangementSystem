package com.kodlamaio.hrms.mailValidation.concretes;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.core.utilites.results.Result;
import com.kodlamaio.hrms.core.utilites.results.SuccessResult;
import com.kodlamaio.hrms.mailValidation.abstracts.MailValidationService;

@Service
public class MailValidationManager implements MailValidationService{
	
	public Result sendMail(String email , String message) {
		return new SuccessResult("Mail gönderildi.");
	}

}
