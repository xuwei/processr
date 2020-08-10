package com.superchoice.processr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@SpringBootApplication
@ComponentScan("com.superchoice") //to scan packages mentioned
@EnableJpaRepositories("com.superchoice") //to activate MongoDB repositories
public class ProcessrApplication {

	@Bean
    public TaskExecutor asyncTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // minimise server resource usage
        executor.setCorePoolSize(1);
        executor.setMaxPoolSize(1);
        
        // queue up to 1000 reqs
        executor.setQueueCapacity(1000);
        executor.setThreadGroupName("asyncExecutor");
        executor.initialize();
        return executor;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ProcessrApplication.class, args);
	}

}
