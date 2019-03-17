package com.soham.trialBoot.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soham.trialBoot.mapper.UserMapper;
import com.soham.trialBoot.model.User;

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
