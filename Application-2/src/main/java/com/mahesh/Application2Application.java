package com.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(Application2Application.class, args);
		Customer c = cxt.getBean(Customer.class);
		c.m1();
	}

}
