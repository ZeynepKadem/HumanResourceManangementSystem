package com.kodlamaio.hrms.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.EmployeeService;
import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping 
	public DataResult<List<Employee>> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
}
