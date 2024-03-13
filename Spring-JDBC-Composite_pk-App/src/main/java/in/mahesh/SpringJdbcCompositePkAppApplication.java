package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.service.PersonService;

@SpringBootApplication
public class SpringJdbcCompositePkAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcCompositePkAppApplication.class, args);
		PersonService personService = context.getBean(PersonService.class);
		personService.mSave();
	}

}
