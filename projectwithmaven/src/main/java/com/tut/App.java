package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Assest a1=new Assest(1111,"mobile",emp1);
		Assest a2=new Assest(2222,"laptop",emp2);
		Assest a3=new Assest(3333,"Tablet",emp3);

		emp1.setEmp_id(101);
		emp1.setEmp_name("Ankit");
		emp1.setEmp_salary(50000);
		emp1.setAssest(a1);

		emp2.setEmp_id(102);
		emp2.setEmp_name("Ayush");
		emp2.setEmp_salary(990000);
		emp2.setAssest(a2);

		emp3.setEmp_id(103);
		emp3.setEmp_name("Kushal");
		emp3.setEmp_salary(98000);
		emp3.setAssest(a3);
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory  =cfg.buildSessionFactory();
		Session s=factory.openSession();

		Transaction tx = s.beginTransaction();
		s.save(emp1);
		s.save(emp2);
		s.save(emp3);
		s.save(a1);
		s.save(a2);
		s.save(a3);
		tx.commit();
	}
}
