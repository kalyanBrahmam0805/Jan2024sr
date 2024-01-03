package spring6;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	Bike bike;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Bike bike) {
		super();
		this.bike = bike;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Student [bike=" + bike + "]";
	}
}
