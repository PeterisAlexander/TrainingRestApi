package com.training.myrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MyrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyrestapiApplication.class, args);
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //registry.addMapping("/**").allowedOrigins("http://localhost:4200"); //autorise l'accès depuis localhost:4200- GET autorisée
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
                // * dans allow origins : çad autoriser toutes les machines
            }
        };
    }
}
