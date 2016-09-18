package com.algaworks.socialbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/*
@SpringBootApplication
public class SocialbooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialbooksApplication.class, args);
	}
}
*/
@SpringBootApplication
public class SocialbooksApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SocialbooksApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SocialbooksApplication.class);
    }
} 