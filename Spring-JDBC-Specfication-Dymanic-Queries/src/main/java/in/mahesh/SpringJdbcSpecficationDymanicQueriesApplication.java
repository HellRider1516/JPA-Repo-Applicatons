package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.Service.ProductService;

@SpringBootApplication
public class SpringJdbcSpecficationDymanicQueriesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcSpecficationDymanicQueriesApplication.class, args);
		ProductService bean = context.getBean(ProductService.class);
		bean.productSave();
	}

}
