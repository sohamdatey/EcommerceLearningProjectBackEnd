package com.onlinerestaurant.foodie.model;

import java.util.Date;
import java.util.List;

public class User {
	
	private int userId;
	private String userName;
	private String email;
	private String password;
	private Date dob;
	private String profileImage;
	private List<UserDeliveryContact> deliveryContacts;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public List<UserDeliveryContact> getDeliveryContacts() {
		return deliveryContacts;
	}
	public void setDeliveryContacts(List<UserDeliveryContact> deliveryContacts) {
		this.deliveryContacts = deliveryContacts;
	}
	
	
	
	
	
}
