package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.yash.dao.UserRepository;

@SpringBootApplication
public class SpringbootloginApplication   {
	

	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootloginApplication.class, args);
	}
}
