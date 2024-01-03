package spring6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Configuration.xml");
		Student s=ctx.getBean("st",Student.class);
	       System.out.println(s);
	       ctx.close();
	} 

}