package com.cognizant.Test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.Test.model.Employee;
import com.cognizant.Test.service.EmployeeService;

public class EmployeeDaoImpl {
	
	@Autowired
 EmployeeService employeeService;
 
 public List<Employee> getAllEmployees(){
	 return employeeService.getAllEmployees();
 }

}
