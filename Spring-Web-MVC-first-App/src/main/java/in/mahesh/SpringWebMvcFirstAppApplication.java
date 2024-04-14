package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.controller.FirstController;

@SpringBootApplication
public class SpringWebMvcFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebMvcFirstAppApplication.class, args);
		FirstController bean = context.getBean(FirstController.class);
		bean.msg1();
		bean.msg2();
	}

}
