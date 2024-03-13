package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.Service.EmpService;

@SpringBootApplication
public class SpringJdbcTwoTablesApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcTwoTablesApp1Application.class, args);
		EmpService bean = context.getBean(EmpService.class);
		//bean.mSave(); 
		bean.getDetails();
	}

}
