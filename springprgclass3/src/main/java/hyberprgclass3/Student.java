package hyberprgclass3;

public class Student {
int rollno;
String name;
float cgpa;
public Student(int rollno, String name, float cgpa) {
	super();
	System.out.println("Parameterized constructor called");
	this.rollno = rollno;
	this.name = name;
	this.cgpa = cgpa;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	System.out.println("Setter called");
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getCgpa() {
	return cgpa;
}
public void setCgpa(float cgpa) {
	this.cgpa = cgpa;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", cgpa=" + cgpa + "]";
}
public Student() {
	super();
}

}
