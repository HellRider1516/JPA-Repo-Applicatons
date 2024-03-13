package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.Service.PersonService;

@SpringBootApplication
public class SpringJdbcApp4Application {

	public static void main(String[] args)  {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcApp4Application.class, args);
		PersonService bean = context.getBean(PersonService.class);
//		bean.getSave();
////		bean.getSomeDetails();
////		bean.getDetails();
//		bean.getByHQLQuery();
		bean.mSaveAll();
	}

}