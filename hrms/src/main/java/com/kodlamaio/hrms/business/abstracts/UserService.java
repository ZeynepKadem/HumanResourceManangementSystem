package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.Result;
import com.kodlamaio.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>>  getAllUsers();

	Result add(User User);
}
