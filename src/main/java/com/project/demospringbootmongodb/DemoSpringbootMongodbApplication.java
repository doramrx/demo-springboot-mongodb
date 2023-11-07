package com.project.demospringbootmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoSpringbootMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootMongodbApplication.class, args);
	}

}
