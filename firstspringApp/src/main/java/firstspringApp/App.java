package firstspringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Configuration.xml");
		
		Cricketer c=(Cricketer)ctx.getBean("cr");
		c.excercise();
		c.play();
	}

}
