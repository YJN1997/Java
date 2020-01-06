package com.training.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ConditionalOnProperty (prefix = "com.trainig.demo.in-memory-no-dlp" , name="enabled" , matchIfMissing = true)
@Profile({"prod","qa"})
public class InMemoryUserManagmentNoDuplicationCionfigration {
	
	@Bean
	public UserManagment inMemoryNoDuplication() {
		return new InMemoryUserManagmentNoDuplication();
	}
}
