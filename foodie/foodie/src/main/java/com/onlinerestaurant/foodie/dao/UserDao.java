package com.onlinerestaurant.foodie.dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.onlinerestaurant.foodie.mappers.UserMapper;
import com.onlinerestaurant.foodie.model.User;

@Component
public class UserDao {

	@Autowired
	private UserMapper UserMapper;

    public List<User> getAllUsers() {
        List<User> userList = UserMapper.getAllUsers();
        return userList;
    }
 
    public User getUserForId(int userId) {
        User user = UserMapper.getUserForId(userId);
        return user;
    }
 
    public int createUser(User user) {
        int insertedRecords = UserMapper.createUser(user);
        return insertedRecords;
    }
 
    public int updateUser(User user) {
        int updatedRecords = UserMapper.updateUser(user);
        return updatedRecords;
    }
 
    public int deleteUser(int userId) {
        int deletedRecords = UserMapper.deleteUser(userId);
        return deletedRecords;
    }

}
