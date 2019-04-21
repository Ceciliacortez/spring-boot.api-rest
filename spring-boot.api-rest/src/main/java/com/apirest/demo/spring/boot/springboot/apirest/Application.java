package com.apirest.demo.spring.boot.springboot.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.apirest.demo.controller.RegistroPersonaController;

//@SpringBootApplication (scanBasePackages = {"com.apirest"})
//@ComponentScan(basePackages = {"controller","com.apirest"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan(basePackageClasses = RegistroPersonaController.class)
//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
