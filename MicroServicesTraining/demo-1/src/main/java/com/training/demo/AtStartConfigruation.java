package com.training.demo;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AtStartConfigruation {
	
	@Bean
	public CommandLineRunner startUp( List<UserManagment> userManagments , Environment env) {
		return args->{
			userManagments
			.stream()
			.peek(um->um.addUser(new User("1","Mosa")))
			.forEach(UserManagment::printUsers);
			
//			System.out.println("From env"+env.getProperty("com.Trainig.demo.application-name"));
//			System.out.println("From env"+env.getProperty("com.training.demo.version"));
//			userManagment.addUser(new User("1","Ahmad"));
//			userManagment.printUsers();
		};
	}
	
	@Bean
	public CommandLineRunner startUp2(List<UserManagment> userManagments , ProjectConfigration projectConfigration) {
		return args->{
			userManagments
			.stream()
			.peek(um->um.addUser(new User("2","Ahmad")))
			.peek(um->um.addUser(new User("1","ahmad")))
			.forEach(UserManagment::printUsers);
//			projectConfigration.setApplicationName("Trainig Project From POJO");
//			System.out.println("From projectConfigration" + projectConfigration.getApplicationName());
//			System.out.println(projectConfigration.getVersion());
//			userManagment.addUser(new User("1","Ahmad"));
//			userManagment.addUser(new User("2","Mousa"));
//			userManagment.printUsers();
		};
	}
}
