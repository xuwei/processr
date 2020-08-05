package com.superchoice.processr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.superchoice") //to scan packages mentioned
@EnableJpaRepositories("com.superchoice") //to activate MongoDB repositories
public class ProcessrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessrApplication.class, args);
	}

}
