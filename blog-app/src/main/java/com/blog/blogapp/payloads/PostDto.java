package com.blog.blogapp.payloads;

import java.util.Date;

import com.blog.blogapp.models.Category;
import com.blog.blogapp.models.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	
	//User provides these details
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private CategoryDto category;
	
	private UserDto user;
	
}
