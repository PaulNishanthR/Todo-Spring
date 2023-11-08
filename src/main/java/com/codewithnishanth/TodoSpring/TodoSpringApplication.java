package com.codewithnishanth.TodoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TodoSpringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext=SpringApplication.run(TodoSpringApplication.class, args);
	}

}
