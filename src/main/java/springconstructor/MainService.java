package springconstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainService {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring2ndlesson.xml");
		
		SchoolService srv = (SchoolService) ctxt.getBean("school");
		
		srv.showAll();
		
		

	}

}
