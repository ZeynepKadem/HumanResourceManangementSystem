package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.UserService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.Result;
import com.kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilites.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.UserRepository;
import com.kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserRepository userRepository;
	
	public UserManager(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}

	@Override
	public DataResult<List<User>> getAllUsers() { 
		
		return new SuccessDataResult<List<User>>(this.userRepository.findAll()//data olarak yolladım
				                                   ,"Data listelendi");
				
	}

	@Override
	public Result add(User user) {
		this.userRepository.save(user);
		
		return new SuccessResult("Kullanıcı eklendi.");
	}

	
}
