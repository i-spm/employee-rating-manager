package com.cognizant.Test.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.Test.model.Employee;


public interface EmpRepository extends JpaRepository<Employee,Integer> {
	

}
