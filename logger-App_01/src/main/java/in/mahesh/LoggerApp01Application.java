package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LoggerApp01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext r = SpringApplication.run(LoggerApp01Application.class, args);
		MsgPrint bean = r.getBean(MsgPrint.class);
		bean.msg();
	}

}
