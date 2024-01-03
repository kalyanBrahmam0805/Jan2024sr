package Spring5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configurationFile.xml");
		Student s=(Student)ctx.getBean("st");
	       System.out.println(s);
	       ctx.close();
	} 

}
