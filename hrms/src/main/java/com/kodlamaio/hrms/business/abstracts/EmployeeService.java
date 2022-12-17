package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilites.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {

	DataResult<List<Employee>> getAllEmployee();

}
