package com.retrospective.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.retrospective.data.constants.Constants;
import com.retrospective.data.entity.User;
import com.retrospective.data.entity.UserCommunication;
import com.retrospective.data.repo.UserCommunicationRepository;
import com.retrospective.data.repo.UserRepository;
import com.retrospective.service.UserService;
import com.retrospective.util.Utils;

import lombok.ToString;

@ToString
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private UserCommunicationRepository userCommunicationRepository;

	public UserServiceImpl(UserRepository userRepository, UserCommunicationRepository userCommunicationRepository) {
		this.userRepository = userRepository;
		this.userCommunicationRepository = userCommunicationRepository;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList = userRepository.findAll();
		System.out.println("getAllUsers çağrıldı.");
		return userList;
	}
	
	@Override
	public List<UserCommunication> getAllUserCommunications() {
		List<UserCommunication> userCommunicationList = userCommunicationRepository.findAll();
		return userCommunicationList;
	}
	
	@Override
	public String getUserEmailByUserId(int id) {
		String email = userCommunicationRepository.getById(id).getValue();
		return email;
	}
	
	public boolean checkUserPass(String email, String pass) {
		UserCommunication userCommunication = userCommunicationRepository.findUserCommunicationByTypeAndValue(Constants.USER_COMM_TYPE_EMAIL, email);
		if(userCommunication != null 
				&& userCommunication.getUser() != null 
				&& Utils.ifStringNotEmpty(pass).equals(userCommunication.getUser().getPassword())) {
			return true;
		}
		return false;
	}
}
