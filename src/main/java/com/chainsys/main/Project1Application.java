package com.chainsys.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@SpringBootApplication
@OpenAPIDefinition(
			info = @Info(
						title = "CRUD Operation Demo",
						version = "1.0.0",
						description = "This is for CRUD Demo",
						termsOfService = "Chainsys",
						contact = @Contact(
									name = "Jegatheeswaran",
									email = "jegathees@gmail.com"
								),
						license = @License(
									name = "Chainsys",
									url = "chainsys.com"
								)
					)
		)
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

}
