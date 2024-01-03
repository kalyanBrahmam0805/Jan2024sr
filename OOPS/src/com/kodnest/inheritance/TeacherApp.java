package com.kodnest.inheritance;

import com.kodnest.encap.main;

public class TeacherApp {
	 public static void main(String[] args) {
		 physicalTeacher ps=new physicalTeacher();
		 ps.name="kalyan";
		 ps.subject="Maths";
		 ps.markattendance();
		 ps.teach();
		 ps.dolawsexp();
		 chemistryTeacher ct=new chemistryTeacher();
		 ct.name="Brahmam";
	     ct.subject="chemsitry";
	     ct.markattendance();
	     ct.teach();
	     ct.dpchemicalexp();
	     biologyTeacher bt=new biologyTeacher();
	     bt.name="Sravan";
	     bt.subject="physics";
	     ps.markattendance();
	     ps.teach();
	     ps.dolawsexp();
		 
	}

}
