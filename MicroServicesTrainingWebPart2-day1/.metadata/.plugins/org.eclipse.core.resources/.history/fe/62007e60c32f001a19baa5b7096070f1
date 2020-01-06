package com.training.demo;

import java.util.HashSet;
import java.util.Set;

public class InMemoryUserManagmentNoDuplication implements UserManagment {
	Set<User> users= new HashSet<>();

	public void addUser(User user) {
		users.add(user);
	}
	
	public void printUsers() {
//		users.stream().forEach(user->System.out.println(user));
		users.stream().forEach(System.out::println);
	}
}
