package com.springswaggerdemo.SpringSwaggerDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2

@SpringBootApplication
public class SpringSwaggerDemoAppApplication {

	public static void main(String[] args){
		SpringApplication.run(SpringSwaggerDemoAppApplication.class, args);
	}



}
