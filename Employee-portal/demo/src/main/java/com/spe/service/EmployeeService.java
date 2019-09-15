package com.spe.service;

import java.util.List;

import com.spe.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployeeDetails();
	
	public Employee createEmployee(Employee emp);
}
