package com.dealgreator.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ImportResource({ "classpath*:application-context.xml" })
@ComponentScan(basePackages = { "Service", "Entity", "Controller", "Repository" })
@EntityScan(basePackages = { "Entity" })
@EnableJpaRepositories(basePackages = { "Repository" })
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

}
