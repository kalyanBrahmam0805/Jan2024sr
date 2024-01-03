package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Assest {
	@Id
	int assest_id;
	String assest_type;
	@OneToOne
	Employee emp;
	public Assest()
	{
		super();
	}
	public Assest(int assest_id, String assest_type, Employee emp) {
		super();
		this.assest_id = assest_id;
		this.assest_type = assest_type;
		this.emp = emp;
	}
	
	

}
