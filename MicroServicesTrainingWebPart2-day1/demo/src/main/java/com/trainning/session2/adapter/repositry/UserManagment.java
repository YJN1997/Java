package com.trainning.session2.adapter.repositry;

import java.util.List;
import java.util.Optional;

import com.trainning.session2.adapter.model.User;
;

public interface UserManagment {
	public List<User> getUsers();
	public void addUser(User user);
	public Optional<User> getUserById(String id);
	public boolean deleteUserById(String id);
	public boolean updateOrReplace(User user) ;
}
