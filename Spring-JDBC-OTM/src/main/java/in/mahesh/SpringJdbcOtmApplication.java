package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcOtmApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcOtmApplication.class, args);
		AuthorService bean = context.getBean(AuthorService.class);
		//bean.authorSave();
		bean.getDetails();
	}

}
