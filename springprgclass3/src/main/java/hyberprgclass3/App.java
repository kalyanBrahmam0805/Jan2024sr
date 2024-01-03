
package hyberprgclass3;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Configuration.xml");
		Student s1 = (Student) ctx.getBean("st1");
		System.out.println(s1);
		ctx.close();
	}
}
