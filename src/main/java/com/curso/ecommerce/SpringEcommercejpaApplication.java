package com.curso.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SpringEcommercejpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommercejpaApplication.class, args);
	}

}
