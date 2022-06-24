package com.example.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	
	//Foreign Key
	@Column(name = "profileidref")
	private int profileIdRef;

	public int getId() {
		return id;
	}

	public int getProfileIdRef() {
		return profileIdRef;
	}

	public void setProfileIdRef(int profileIdRef) {
		this.profileIdRef = profileIdRef;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	
}
