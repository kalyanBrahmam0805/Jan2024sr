package Spring5;

public class Student {
Laptop lappy;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(Laptop lappy) {
	super();
	this.lappy = lappy;
}

public Laptop getLappy() {
	return lappy;
}

public void setLappy(Laptop lappy) {
	this.lappy = lappy;
}

@Override
public String toString() {
	return "Student [lappy=" + lappy + "]";
}
}
