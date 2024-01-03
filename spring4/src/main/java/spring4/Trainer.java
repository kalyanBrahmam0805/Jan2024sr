package spring4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Trainer {
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	List subjects;
	Set students;
	Map batches;
	public Trainer(List subjects, Set students, Map batches) {
		super();
		this.subjects = subjects;
		this.students = students;
		this.batches = batches;
	}
	public List getSubjects() {
		return subjects;
	}
	public void setSubjects(List subjects) {
		this.subjects = subjects;
	}
	public Set getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
	}
	public Map getBatches() {
		return batches;
	}
	public void setBatches(Map batches) {
		this.batches = batches;
	}
	@Override
	public String toString() {
		return "Trainer [subjects=" + subjects + ", students=" + students + ", batches=" + batches + "]";
	}
	
	
	

}
