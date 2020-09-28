package ru.studentsplatform.blockchain.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.studentsplatform.blockchain.*"})
@EntityScan(basePackages = {"ru.studentsplatform.blockchain.*"})
@EnableJpaRepositories(basePackages = "ru.studentsplatform.blockchain.domain.repository")
public class EndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointApplication.class, args);
	}

}
