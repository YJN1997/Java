package com.trainning.session2.adapter.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainning.session2.adapter.model.User;
import com.trainning.session2.repositryImp.UserManagmentConfigration;

@RestController
@RequestMapping("/index")
public class DemoRestAppleaction {
	UserManagmentConfigration user = new UserManagmentConfigration();

	@GetMapping("/")
	public List<User> getUsers() {
		return user.Users().getUsers();
	}
	
	@GetMapping("/{userId}")
	public Optional<User> getUserById(@PathVariable("userId") String userId) {
		return user.Users().getUserById(userId);
	}
	
	@PostMapping("/create")
	public void addUser(@RequestBody User newUser) {
		user.Users().addUser(newUser);
	}
	
	@PatchMapping("/update")
	public boolean updateUser(@RequestBody User newUser) {
		// This Method must update only the name but because the object have only the name and the id so this one will work
		return user.Users().updateOrReplace(newUser);
	}
	
	@PutMapping("/replace")
	public boolean replaceUser(@RequestBody User newUser) {
		return user.Users().updateOrReplace(newUser);
	}
	
	@DeleteMapping("/delete")
	public boolean deleteUser(@RequestBody String id){
		return user.Users().deleteUserById(id);
	}
	
}
