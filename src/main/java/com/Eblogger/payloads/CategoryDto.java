package com.Eblogger.payloads;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private Integer categoryId;
	
	@Size(min=3,max=25,message ="Title Should Have Atleast 3 and Atmost 25 Charaters.") 
	private String categoryTitle;

	@Size(min=3,max=1000,message ="Description Should Have Atleast 3 Charaters.")
	private String categoryDescription;
}
