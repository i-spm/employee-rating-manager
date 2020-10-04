package com.cognizant.Test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.Test.model.Employee;
import com.cognizant.Test.repository.EmpRepository;

@Service
public class EmployeeService {
	
@Autowired
EmpRepository empRepository;
	
	public List<Employee> getAllEmployees(){
		return empRepository.findAll();
		
	}
}
