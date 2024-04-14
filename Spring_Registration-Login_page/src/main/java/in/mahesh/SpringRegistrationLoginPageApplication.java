package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.controller.PersonDetailsController;

@SpringBootApplication
public class SpringRegistrationLoginPageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRegistrationLoginPageApplication.class, args);
		PersonDetailsController bean = context.getBean(PersonDetailsController.class);
		//bean.sendMail();
	}

}
