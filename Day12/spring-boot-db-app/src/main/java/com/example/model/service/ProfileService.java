package com.example.model.service;

import java.util.List;

import com.example.exceptions.ProfileNotFoundException;
import com.example.model.beans.Profile;

//interface for business layer
//needs to be implemented by developer
public interface ProfileService {
	//must store profile + return created one
	public Profile storeProfile(Profile profile); 
	
	//must return all profiles in List<Profile>
	public List<Profile> fetchProfiles();
	
	public Profile fetchProfile(int id) throws ProfileNotFoundException;

}

