package com.blog.blogapp.services;

import java.util.List;

import com.blog.blogapp.models.Post;
import com.blog.blogapp.payloads.PostDto;

public interface PostService {
	
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);
	
	Post updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	List<Post> getAllPost();
	
	Post getPostById(Integer postId);
	
	List<Post> getPostsByCategory(Integer categoryId);
	
	List<Post> getPostsByUser(Integer userId);
	
	//search post
	List<Post> searchPosts(String keyword);
}
