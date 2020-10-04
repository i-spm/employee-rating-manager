package com.cognizant.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Test.dao.EmployeeDaoImpl;
import com.cognizant.Test.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	public List<Employee> getAllEmployees(){
		return employeeDaoImpl.getAllEmployees();
	}
	
}
