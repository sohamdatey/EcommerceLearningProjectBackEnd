package com.onlinerestaurant.foodie.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.onlinerestaurant.foodie.model.User;

public interface UserMapper {

	public List<User> selectAllUsers();

	public User selectUser(@Param("id") int id);

	public int insertUser(User User);
}
