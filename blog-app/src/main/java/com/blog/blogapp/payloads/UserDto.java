package com.blog.blogapp.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message="Usename must be atleast of 4 characters")
	private String name;
	
	@NotBlank
	@Size(min=3, max=10, message = "Password must have min 3 and max 10 characters")
	private String password;
	
	@Email(message = "Invalid Email !")
	private String email;
	
	@NotBlank
	private String about;

}
