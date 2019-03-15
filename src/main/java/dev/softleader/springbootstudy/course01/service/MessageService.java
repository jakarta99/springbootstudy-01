package dev.softleader.springbootstudy.course01.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	public String sayHello(String name) {
		return "Hello, "+name;
	}
	

}
