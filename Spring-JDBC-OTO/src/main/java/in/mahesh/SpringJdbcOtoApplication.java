package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.service.PersonService;

@SpringBootApplication
public class SpringJdbcOtoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcOtoApplication.class, args);
		PersonService bean = context.getBean(PersonService.class);
		//bean.personSave();
		bean.getDetails();
	}

}