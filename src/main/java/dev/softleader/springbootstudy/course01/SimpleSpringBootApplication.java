package dev.softleader.springbootstudy.course01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringBootApplication {

	public static void main(String[] args) {
		
		System.out.println("Hello, we begin to start Simple SpringBoot now...");
		
		SpringApplication.run(SimpleSpringBootApplication.class, args);
		
		System.out.println("Simple SpringBoot already finished now...");
	}

}
