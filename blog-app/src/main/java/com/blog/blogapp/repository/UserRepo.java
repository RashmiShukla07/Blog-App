package com.blog.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogapp.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	
}
