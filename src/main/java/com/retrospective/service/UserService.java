package com.retrospective.service;

import java.util.List;

import com.retrospective.data.entity.User;
import com.retrospective.data.entity.UserCommunication;

public interface UserService {

	List<User> getAllUsers();
	
	List<UserCommunication> getAllUserCommunications();
	
	String getUserEmailByUserId(int id);
	
	boolean checkUserPass(String email, String pass);
}
