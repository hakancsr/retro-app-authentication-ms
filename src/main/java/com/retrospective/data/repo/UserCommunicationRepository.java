package com.retrospective.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.retrospective.data.entity.UserCommunication;

public interface UserCommunicationRepository extends JpaRepository<UserCommunication, Integer> {
	
	UserCommunication findUserCommunicationByTypeAndValue(String type, String value);

}
