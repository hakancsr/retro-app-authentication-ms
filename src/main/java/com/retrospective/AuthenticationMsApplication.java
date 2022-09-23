package com.retrospective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@EnableJpaRepositories
@SpringBootApplication(scanBasePackages= "com.retrospective")
public class AuthenticationMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationMsApplication.class, args);
	}
}
