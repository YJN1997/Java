package com.trainning.session2.repositryImp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserManagmentConfigration {
		
	@Bean
	public UserManagmentImp Users() {
		return new UserManagmentImp();
	}
}
