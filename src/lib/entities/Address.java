package lib.entities;

public class Address {
	
	 int buildingNumber;
	 String street, apt, city, state;
	 int zipCode;
	 User user;
	 
	 
	public Address(int buildingNumber, String street, String apt, String city, String state, int zipCode, User user) {
		super();
		this.buildingNumber = buildingNumber;
		this.street = street;
		this.apt = apt;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.user = user;
	}
	
	
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public String getStreet() {
		return street;
	}
	public String getApt() {
		return apt;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public User getUser() {
		return user;
	}
	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setApt(String apt) {
		this.apt = apt;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public void setUser(User user) {
		this.user = user;
	}
	 
	 
	 
	 

	 
	 
}
