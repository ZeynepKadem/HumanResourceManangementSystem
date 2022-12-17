package com.kodlamaio.hrms.mailValidation.concretes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.core.utilites.results.ErrorResult;
import com.kodlamaio.hrms.core.utilites.results.Result;
import com.kodlamaio.hrms.core.utilites.results.SuccessResult;
import com.kodlamaio.hrms.mailValidation.abstracts.MailCheckService;

@RestController
@RequestMapping("/api/mailcheck")
public class MailCheckController {

	private MailCheckService mailCheckService;

	public MailCheckController(MailCheckService mailCheckService) {
		super();
		this.mailCheckService = mailCheckService;
	}

	@GetMapping("/check")
	public Result checkMail(String email) {
		if(mailCheckService.isMailRegistered(email)) {
			return new ErrorResult("Girmiş olduğunuz mail zaten kayıtlı!");
			
		}else
			return new SuccessResult();
	}
}
