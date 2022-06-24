package com.example.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.beans.User;
import com.example.model.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class MyRestApi {
	
	//auto inject service
	@Autowired
	private UserServiceImpl service;
	
	//storing user
	@PostMapping
	public User store(@RequestBody User user) {
		return service.storeUser(user);
	}
	
	//fetching all user
	@GetMapping
	public List<User> fetchUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public Map<String, String>getUser(@PathVariable("userId") int id){
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(""+id);
		User user = service.getUser(id);
		System.out.println(user);
		if(user == null) {
			map.put("error", "user with "+id+" not found");
		}else {
			map.put("userID", ""+user.getUserId());
			map.put("name",user.getName());
			map.put("dob", ""+user.getDob());
		}
		return map;
	}
	

}
