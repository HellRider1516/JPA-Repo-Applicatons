package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.Controller.PersonController;
import in.mahesh.service.PersonService;

@SpringBootApplication
public class SpringWebMvcApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebMvcApp1Application.class, args);
		PersonController bean = context.getBean(PersonController.class);
		//bean.savePerson();
		bean.personDetails();
		
		
		
	}

}
