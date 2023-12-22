package com.Eblogger.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Eblogger.entity.Category;
import com.Eblogger.entity.Post;
import com.Eblogger.entity.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
