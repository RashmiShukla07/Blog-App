package com.blog.blogapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogapp.models.Category;
import com.blog.blogapp.models.Post;
import com.blog.blogapp.models.User;

public interface PostRepo extends JpaRepository<Post,Integer> {
	
	//custom finder methods
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
}
