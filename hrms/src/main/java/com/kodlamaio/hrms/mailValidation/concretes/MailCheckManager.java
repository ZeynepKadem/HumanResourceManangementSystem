package com.kodlamaio.hrms.mailValidation.concretes;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.dataAccess.abstracts.UserRepository;
import com.kodlamaio.hrms.mailValidation.abstracts.MailCheckService;

@Service
public class MailCheckManager implements MailCheckService {

	private UserRepository userRepository;
	
	
	public MailCheckManager(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public boolean isMailRegistered(String email) {
		if(userRepository.findByEmailEquals(email).size()==0) {
			return false;
		}
		return true;
	}

}
