package shawdoingproblem;

public class person {
int id; 
String name;
String gender;
String email;
long phno;
public person(int id, String name, String gender, String email, long phno) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.email = email;
	this.phno = phno;
}

void eat() {
	System.out.println(name+"IS eating.....");
}
void sleep() {
	System.out.println(gender+" "+name+ "is sleeping");
}
}
