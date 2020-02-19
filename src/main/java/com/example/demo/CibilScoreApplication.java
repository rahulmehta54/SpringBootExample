package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="fetch cibil score",
contact=@Contact(email="rjrahul@gmail.com",name="Rahul")))
public class CibilScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CibilScoreApplication.class, args);
	}

}
