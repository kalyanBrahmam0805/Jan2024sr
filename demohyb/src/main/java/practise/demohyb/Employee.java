package practise.demohyb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	int eId;
	String name;
	int esalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String name, int esalary) {
		super();
		this.eId = eId;
		this.name = name;
		this.esalary = esalary;
	}


	
}
