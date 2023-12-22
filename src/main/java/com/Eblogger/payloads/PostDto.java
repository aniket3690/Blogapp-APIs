package com.Eblogger.payloads;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	@NotBlank(message="title can't be blank.")
	private String title;
	@NotBlank(message="content can't be blank.")
	private String content;
	private String imageName;
	private Date date;
	
	private CategoryDto category;
	private UserDto user;
}
