package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.Service;

@SpringBootApplication
public class Application01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(Application01Application.class, args);
		Service bean = cxt.getBean(Service.class);
		bean.name(105);
	}

}
