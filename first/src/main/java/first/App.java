package first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 

				new ClassPathXmlApplicationContext("configuration.xml"); 
		Student s1 =  (Student) context.getBean("s1");
		System.out.println("---> Object created by Spring = "+ s1);
	}

}


