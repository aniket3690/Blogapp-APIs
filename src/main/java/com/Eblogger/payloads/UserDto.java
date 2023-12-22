package com.Eblogger.payloads;

//import javax.validation.constraints.*;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private Integer id;
	
	@Size(min=3,message ="Name Should Have Atleast 3 Charaters.")
	private String name;
	
	@Email(message = "Invalid Email Address")
	private String mail;

	@Size(min=8,max=16,message ="Password Should Have Atleast 8 and Atmost 12 Charaters.")
	private String password;
	
	@NotBlank(message = "About Cannot Be Empty")
	private String about;
}
