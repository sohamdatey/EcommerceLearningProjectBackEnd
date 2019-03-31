package com.onlinerestaurant.foodie.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinerestaurant.foodie.mappers.UserMapper;
import com.onlinerestaurant.foodie.model.User;
import com.onlinerestaurant.foodie.model.UserDeliveryContact;

@Component
public class UserDao {

	@Autowired
	private UserMapper userMapper;

    public List<User> getAllUsers() {
        List<User> userList = userMapper.getAllUsers();
        return userList;
    }
 
    public User getUserForId(int userId) {
        User user = userMapper.getUserForId(userId);
        return user;
    }
 
    public int createUser(User user) {
        int noOfInsertedRecords = userMapper.createUser(user);
        List<UserDeliveryContact> userDeliveryContactList= user.getDeliveryContacts();
        
        for (UserDeliveryContact userDeliveryContact : userDeliveryContactList) {
			insertUserDeliveryContact(userDeliveryContact);
		}
        return noOfInsertedRecords;
    }
 
    public int updateUser(User user) {
        int noOfUpdatedRecords = userMapper.updateUser(user);
        return noOfUpdatedRecords;
    }
 
    public int deleteUser(int userId) {
        int noOfDeletedRecords = userMapper.deleteUser(userId);
        deleteAllUserDeliveryContactsForUserId(userId);
        return noOfDeletedRecords;
    }
    
    public int insertUserDeliveryContact(UserDeliveryContact userDeliveryContact) {
        int noOfinsertedRecords = userMapper.insertUserDeliveryContact(userDeliveryContact);
        return noOfinsertedRecords;
    }
    
    public int updateUserDeliveryContact(UserDeliveryContact userDeliveryContact) {
        int noOfUpdatedRecords = userMapper.updateUserDeliveryContact(userDeliveryContact);
        return noOfUpdatedRecords;
    }
    
    public int deleteUserDeliveryContact(int userDeliveryContactId) {
        int noOfinsertedRecords = userMapper.deleteUserDeliveryContact(userDeliveryContactId);
        return noOfinsertedRecords;
    }
    
    public int deleteAllUserDeliveryContactsForUserId(int userId) {
        int noOfDeletedRecords = userMapper.deleteAllUserDeliveryContactsForUserId(userId);
        return noOfDeletedRecords;
    }
    
    
    

}
