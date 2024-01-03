package spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Confu.xml");
            
		 
		
		 Player	p=(Cricketer)ctx.getBean("p") ;    
           p.excercise();
           p.play();
           
//           p=(Footballer)ctx.getBean("fb") ;    
//           p.excercise();
//           p.play();
//           
//           
//           p=(Wrestler)ctx.getBean("wc") ;    
//           p.excercise();
//           p.play();
	}

}
