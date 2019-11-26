package com.decathlon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Decathlon");
	}

	@Bean
	public Docket swaggerConfiguration(){
		// Return prepared Docket instance

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/test/*"))
				.apis(RequestHandlerSelectors.basePackage("com.decathlon"))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo(){
		return new ApiInfo(
				"demo api",
				"sample api for our work",
				"1:0",
				"Free use",
				new Contact("Praveen", "", "praveenkumar.beedanal@decathlon.com"),
				"API License",
				"decathlon.de",
				Collections.emptyList()
		);
	}

}
