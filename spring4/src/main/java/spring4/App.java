package spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configuration.xml");
       Trainer t=(Trainer)ctx.getBean("t");
       System.out.println(t);
       ctx.close();
	}
	

}
