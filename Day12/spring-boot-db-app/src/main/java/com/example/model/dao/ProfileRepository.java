package com.example.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.beans.Profile;

//ProfileRepository must work on Profile entity and primary key is an integer
public interface ProfileRepository extends JpaRepository<Profile,Integer>{

}
