package com.retrospective.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retrospective.data.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
