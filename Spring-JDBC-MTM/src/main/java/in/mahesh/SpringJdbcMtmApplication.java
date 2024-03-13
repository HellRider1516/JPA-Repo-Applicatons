package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.Service.UserService;

@SpringBootApplication
public class SpringJdbcMtmApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcMtmApplication.class, args);
		UserService bean = context.getBean(UserService.class);
		bean.userSave();
	}

}
