package com.onlinerestaurant.foodie.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.onlinerestaurant.foodie.model.User;

public interface UserMapper {

	public int deleteUser(@Param("userId") int userId);

	public List<User> getAllUsers();

	public User getUserForId(@Param("userId") int userId);

	public int createUser(@Param("user") User user);

	public int updateUser(@Param("user") User user);
	
}
