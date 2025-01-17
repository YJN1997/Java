package com.trainning.session2.repositryImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.trainning.session2.adapter.model.User;
import com.trainning.session2.adapter.repositry.UserManagment;

public class UserManagmentImp implements UserManagment{

	List<User> users = new ArrayList<User>();

	@Override
	public List<User> getUsers() {
		return users;

	}
	
	@Override
	public void addUser(User user) {
		users.add(user);
		
	}

	@Override
	public Optional<User> getUserById(String id) {
		for (User user : users) {
			if(user.getId().equals(id))
				return Optional.of(user);
		}
		return Optional.empty();
	}
	
	public boolean updateOrReplace(User newUser) {
		for (User user : users) {
			if(user.getId().equals(newUser.getId()))
				{
					users.remove(user);
					users.add(newUser);
					return true ;
				}
		}
		return false;
	}

	@Override
	public boolean deleteUserById(String id) {
		for (User user : users) {
			if(user.getId().equals(id))
				{
					users.remove(user);
					return true ;
				}
		}
		return false;
	}
}
