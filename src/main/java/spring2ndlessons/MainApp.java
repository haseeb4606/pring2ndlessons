 package spring2ndlessons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring2ndlessons.Address;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring2ndlesson.xml");
		
		Address adr = (Address) ctxt.getBean("add1");
		
		System.out.println(adr.toString());
		

	}

}
 