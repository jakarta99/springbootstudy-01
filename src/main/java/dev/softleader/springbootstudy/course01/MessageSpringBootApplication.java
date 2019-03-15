package dev.softleader.springbootstudy.course01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dev.softleader.springbootstudy.course01.service.MessageService;

@SpringBootApplication
public class MessageSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MessageSpringBootApplication.class, args);

		MessageService messageService = (MessageService) context.getBean("messageService");

		System.out.println(messageService.sayHello("Gary Lee"));

	}

}
