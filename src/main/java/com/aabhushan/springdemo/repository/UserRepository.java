package com.aabhushan.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aabhushan.springdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	//Spring Data jpa CONVENTION
	User findByUsernameAndPassword(String un,String psw);
	


}
