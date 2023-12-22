package com.Eblogger.services;

import java.util.List;

import com.Eblogger.payloads.CategoryDto;

public interface CategoryService {
	
	//Create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//Update
	CategoryDto updateCategory(CategoryDto categoryDto , Integer categoryId);
	
	//Delete
	void deleteCategory(Integer categoryId);
	
	//gGet
	CategoryDto getCategory(Integer categoryId);
	
	//GetAll
	List<CategoryDto> getCategories();
}
