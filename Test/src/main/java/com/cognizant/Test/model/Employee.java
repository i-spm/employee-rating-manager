package com.cognizant.Test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EmployeeData")
public class Employee{
	
	@Id
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="emp_name")
	private String emp_name;
	
	@Column(name="emp_designation")
	private String emp_designation;

	@Column(name="mgr_id")
	private int mgr_id;
	
	@Column(name="rating_A")
	private int rating_A;
	
	@Column(name="rating_B")
	private int rating_B;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public int getMgr_id() {
		return mgr_id;
	}

	public void setMgr_id(int mgr_id) {
		this.mgr_id = mgr_id;
	}

	public int getRating_A() {
		return rating_A;
	}

	public void setRating_A(int rating_A) {
		this.rating_A = rating_A;
	}

	public int getRating_B() {
		return rating_B;
	}

	public void setRating_B(int rating_B) {
		this.rating_B = rating_B;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_designation=" + emp_designation
				+ ", mgr_id=" + mgr_id + ", rating_A=" + rating_A + ", rating_B=" + rating_B + "]";
	}

	public Employee(int emp_id, String emp_name, String emp_designation, int mgr_id, int rating_A, int rating_B) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_designation = emp_designation;
		this.mgr_id = mgr_id;
		this.rating_A = rating_A;
		this.rating_B = rating_B;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
