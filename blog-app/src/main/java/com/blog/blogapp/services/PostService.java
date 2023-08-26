package com.blog.blogapp.services;

import java.util.List;

import com.blog.blogapp.models.Post;
import com.blog.blogapp.payloads.PostDto;

public interface PostService {
	
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	List<PostDto> getAllPost();
	
	PostDto getPostById(Integer postId);
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	List<PostDto> getPostsByUser(Integer userId);
	
	//search post
	List<Post> searchPosts(String keyword);
}
