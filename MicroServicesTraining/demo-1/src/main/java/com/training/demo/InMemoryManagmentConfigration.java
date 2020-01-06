package com.training.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ConditionalOnProperty (prefix = "com.trainig.demo.in-memory" , name="enabled" , matchIfMissing = false)
@Profile({"prod","qa"})
public class InMemoryManagmentConfigration {
	
	@Bean
	public UserManagment inMemory(){
		return new InMemoryUserManagment();
	}
}
