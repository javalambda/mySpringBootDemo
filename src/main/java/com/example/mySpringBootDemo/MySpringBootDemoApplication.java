package com.example.mySpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootDemoApplication.class, args);
		System.out.println("Completed MAINNNNNNNNNNNNNN");
	}

	@RequestMapping("/hello")
	public String sayHello() {
		return "HIIIIIIIIIIIIII from Boot-Rest";
	}
}
