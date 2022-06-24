package com.example.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.beans.User;

//this object is auto created and registered in spring container
//it can be autowired to other object present in spring container
//note; must use interface and implement it here, but for demo purposes we are using class directly
@Service
public class UserServiceImpl {
	//a list which acts like a temporary DB to store user data
	private static List<User> usersList = new ArrayList<User>();
	
	//method to add user to user list and return stored user
	public User storeUser(User user){
		int counter = usersList.size();
		user.setUserId(++counter); //setting user id to user object
		usersList.add(user);
		return user;
	}
	
	public List<User> getAllUsers(){
		return usersList;
	}
	
	public User getUser(int id){
		User temp;
		for (int i = 0; i<usersList.size();i++){
			temp = usersList.get(i);
			if(temp.getUserId() == id){
				return temp;
			}
		}
		return null;
	}
}
	
