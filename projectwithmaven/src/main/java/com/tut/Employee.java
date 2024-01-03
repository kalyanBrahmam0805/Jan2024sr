package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
//	int Emp_id;
//	int salary;
//	String Emp_name;
//	
	
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


	public int getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}


	public Assest getAssest() {
		return assest;
	}


	public void setAssest(Assest assest) {
		this.assest = assest;
	}


	@Id
	int emp_id;
	String emp_name;
	int emp_salary;
	@OneToOne
     Assest assest;
	

	public Employee() {
		super();
	}


	public Employee(int emp_id, String emp_name, int emp_salary , Assest assest) {
		
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary =emp_salary;
		this.assest = assest;
	}


	
	
}
