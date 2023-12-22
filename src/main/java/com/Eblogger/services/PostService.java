package com.Eblogger.services;

import java.util.List;

import com.Eblogger.entity.Post;
import com.Eblogger.payloads.PostDto;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto,Integer userID,Integer categoryId);
	
	//update
	Post updatePost(PostDto postDto ,Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all post
	List<PostDto> getAllPost();
	
 	//get single post
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search Post
	List<Post> searchPost(String keyword);
	
}
