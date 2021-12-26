package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguge;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> coutryOptions;
	
	public Student() {
		
		coutryOptions = new LinkedHashMap<String, String>();
		
		coutryOptions.put("BR", "Brazil"); // keycode / value
		coutryOptions.put("FR", "France"); 
		coutryOptions.put("DE", "Germany"); 
		coutryOptions.put("IN", "India"); 
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCoutryOptions() {
		return coutryOptions;
	}

	public String getFavoriteLanguge() {
		return favoriteLanguge;
	}

	public void setFavoriteLanguge(String favoriteLanguge) {
		this.favoriteLanguge = favoriteLanguge;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public void setCoutryOptions(LinkedHashMap<String, String> coutryOptions) {
		this.coutryOptions = coutryOptions;
	}

	
	
	
}
