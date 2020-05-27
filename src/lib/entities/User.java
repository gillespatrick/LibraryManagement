package lib.entities;

import lib.inter.Iconnect;

public class User implements Iconnect{
	
	String firstName, lastName, email, password;
	int phone;
	
	
	
	public User(String firstName, String lastName, String email, String password, int phone) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getEmail() {
		return email;
	}



	public String getPassword() {
		return password;
	}



	public int getPhone() {
		return phone;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}


	/**
	 * Here we implement the interface methods: Login and Logout
	 */
	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
