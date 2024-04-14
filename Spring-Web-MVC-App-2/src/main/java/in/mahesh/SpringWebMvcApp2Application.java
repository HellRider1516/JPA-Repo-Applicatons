package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.controller.BookController;

@SpringBootApplication
public class SpringWebMvcApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebMvcApp2Application.class, args);
		BookController bean = context.getBean(BookController.class);
		bean.loadDetails();
	}

}
