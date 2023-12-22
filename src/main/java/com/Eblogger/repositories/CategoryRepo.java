package com.Eblogger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Eblogger.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
