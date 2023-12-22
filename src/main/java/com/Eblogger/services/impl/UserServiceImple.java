package com.Eblogger.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eblogger.entity.User;

import com.Eblogger.exceptions.*;
import com.Eblogger.payloads.UserDto;
import com.Eblogger.repositories.UserRepo;
import com.Eblogger.services.UserService;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserRepo userRepo; 
	
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public UserDto CreateUser(UserDto userDto) {
		User user = this.dtoToUser(userDto);
		User SavedUser = this.userRepo.save(user);
		return this.userToDto(SavedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		User user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User","Id",userId));
		user.setName(userDto.getName());
		user.setMail(userDto.getMail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		
		User updatedUser = this.userRepo.save(user);
		UserDto userDto1 = this.userToDto(updatedUser);
		return userDto1;
	}

	@Override
	public UserDto GetUserById(Integer userId) {
		User user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User","Id",userId));
		return this.userToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User>users=this.userRepo.findAll();
		List<UserDto> userDtos = users.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public void DeleteUser(Integer userId) {
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user", "Id",userId));
		this.userRepo.delete(user);
	}
	
	private User dtoToUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);		
		return user;		
	}
	
	public UserDto userToDto(User user) {
		UserDto userdto = this.modelMapper.map(user,UserDto.class);		
		return userdto;	
		
	}

}
