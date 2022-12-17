package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.EmployeeService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployeeRepository;
import com.kodlamaio.hrms.entities.concretes.Employee;



@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeRepository employeeRepository;

	

	public EmployeeManager(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public DataResult<List<Employee>> getAllEmployee() {
	
		return new SuccessDataResult<List<Employee>>(this.employeeRepository.findAll(),"Çalışanlar listelendi.");
		
	}

}
