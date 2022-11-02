package com.luv2code.springdemo.mvc;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class SpringMvcDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcDemoApplication.class, args);
	}
}
