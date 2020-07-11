package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.demo.**"})
@EnableJpaRepositories(basePackages={"com.example.demo.repos"})
@EntityScan({"com.example.demo.**"})
public class FlightapplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(FlightapplicationApplication.class, args);
	}

}
