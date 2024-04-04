package com.bruno.mazzoni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.mazzoni.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}