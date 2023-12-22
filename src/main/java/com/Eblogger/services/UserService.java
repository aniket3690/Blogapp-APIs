package com.Eblogger.services;

import java.util.List;
import com.Eblogger.payloads.UserDto;

public interface UserService {
	
	UserDto CreateUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto GetUserById(Integer userId);
	List<UserDto>getAllUsers();
	void DeleteUser(Integer userId);
	

}
