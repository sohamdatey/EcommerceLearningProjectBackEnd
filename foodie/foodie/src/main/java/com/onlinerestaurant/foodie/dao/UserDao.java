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

	public List<User> selectAllUsers() {
		return UserMapper.selectAllUsers();
	}

	public User selectUser(int id) {
		return UserMapper.selectUser(id);
	}

	public int insertUser(User User) {
		return UserMapper.insertUser(User);
	}
}
