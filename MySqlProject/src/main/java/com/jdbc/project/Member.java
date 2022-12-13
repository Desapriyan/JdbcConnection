package com.jdbc.project;

public class Member {

	private String Name;
	private String Email;
	private String Phone;

	
public Member( String name, String email,String phone) {
		super();
		
     	Name = name;
		Email = email;
	
		Phone = phone;
	}


public Member() {
	// TODO Auto-generated constructor stub
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}


public String getPhone() {
	return Phone;
}


public void setPhone(String phone) {
	Phone = phone;
}



}




