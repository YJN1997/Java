package com.training.demo;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserManagment implements UserManagment {
List<User> users= new ArrayList<>();

	public void addUser(User user) {
		users.add(user);
	}
	
	public void printUsers() {
//		users.stream().forEach(user->System.out.println(user));
		users.stream().forEach(System.out::println);
	}
}
