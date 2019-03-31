package com.onlinerestaurant.foodie.model;

public class UserDeliveryContact {

	public static final String ADDRESS_TYPE_HOME="Home";
	public static final String ADDRESS_TYPE_WORK="Work";
	public static final String ADDRESS_TYPE_RELATIVE="Relative";
	
	private int userId;
	private int userDeliveryContactId;
	private String name;
	private String address;
	private long contactNo;
	private String addressType;
	
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
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
	
}
