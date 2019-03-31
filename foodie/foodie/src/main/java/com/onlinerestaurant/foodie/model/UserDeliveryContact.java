package com.onlinerestaurant.foodie.model;

public class UserDeliveryContact {

	private int userId;
	private int userDeliveryContactId;
	private String name;
	private String address;
	private long contactNo;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserDeliveryContactId() {
		return userDeliveryContactId;
	}
	public void setUserDeliveryContactId(int userDeliveryContactId) {
		this.userDeliveryContactId = userDeliveryContactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	
}
