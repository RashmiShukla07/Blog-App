package com.blog.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogapp.models.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
	
}
