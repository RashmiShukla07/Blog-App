package com.blog.blogapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blogapp.payloads.ApiResponse;
import com.blog.blogapp.payloads.PostDto;
import com.blog.blogapp.services.PostService;

@RestController
@RequestMapping("/api/")
public class PostController {
	@Autowired 
	private PostService postService;
	
//create	
	@PostMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createPost(
			@RequestBody PostDto postDto,
			@PathVariable Integer userId,
			@PathVariable Integer categoryId){
		PostDto createPost = this.postService.createPost(postDto, userId, categoryId);
		return new ResponseEntity<>(createPost, HttpStatus.CREATED);
	}
	
//get posts by users
	@GetMapping("/user/{userId}/posts")
	public ResponseEntity<List<PostDto>> getPostsByUser(@PathVariable Integer userId){
		List<PostDto> posts = this.postService.getPostsByUser(userId);
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}
	
//get posts by users
	@GetMapping("/category/{categoryId}/posts")
	public ResponseEntity<List<PostDto>> getPostsByCategory(@PathVariable Integer categoryId){
		List<PostDto> posts = this.postService.getPostsByCategory(categoryId);
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}

//get all posts
	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPosts(){
		List<PostDto> posts = this.postService.getAllPost();
		return new ResponseEntity<>(posts,HttpStatus.OK);
	}

//get post by post id 
	@GetMapping("/posts/{postId}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId){
		PostDto post = this.postService.getPostById(postId);
		return new ResponseEntity<>(post,HttpStatus.OK);
	}
	
//update post 
	@PutMapping("/posts/{postId}")
	public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable Integer postId){
		PostDto post =  this.postService.updatePost(postDto, postId);
		return new ResponseEntity<>(post, HttpStatus.OK);
	}

//delete post
	@DeleteMapping("/posts/{postId}")
	public ResponseEntity<ApiResponse> deletePost(@PathVariable Integer postId) {
		this.postService.deletePost(postId);
		return new ResponseEntity<>(new ApiResponse("Post sucessfully deleted!",true),HttpStatus.OK);
	}
}
