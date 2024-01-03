package practise.demohyb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    
	public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
   Configuration cfg=new Configuration();
       cfg.configure();
     SessionFactory factory  =cfg.buildSessionFactory();
      Session s=factory.openSession();
    Employee emp= new Employee(1999,"Nerella",390000);
  Transaction t = s.beginTransaction();
    s.save(emp);
    t.commit();
    }
    
}
