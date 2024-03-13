package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.Service.PhoneService;

@SpringBootApplication
public class SpringJdbcApp3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(SpringJdbcApp3Application.class, args);
		PhoneService bean = cxt.getBean(PhoneService.class);
//		bean.setSaveAll();
//		bean.getFindAll();
//		bean.getByPagination();
		bean.getBySorting();
	}

}
