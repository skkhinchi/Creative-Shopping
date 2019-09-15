package com.sumit.demo.Services;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sumit.demo.Repository.UserRepository;
import com.sumit.demo.model.User;

@Service
@Transactional
public class UserService 
{
	private final UserRepository userRepository;  
	
	UserService(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
	public void saveMyUser(User user)
	{
		userRepository.save(user);
	}
	public List<User> showAllUsers()  //User , user class h
	{
		List<User> users=new ArrayList<User>();// users ArrayList k obj ko hold karega
		for(User user:userRepository.findAll()) //this is iterating 
		{
			users.add(user); 
		}
		return users;
	}

	public void deleteMyUser(int id) {
		userRepository.deleteById(id);
	}
	public User editUser(int id) {
		return userRepository.findById(id);
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	
	
	
}