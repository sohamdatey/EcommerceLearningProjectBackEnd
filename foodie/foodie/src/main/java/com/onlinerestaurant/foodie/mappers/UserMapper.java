package com.onlinerestaurant.foodie.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.onlinerestaurant.foodie.model.User;
import com.onlinerestaurant.foodie.model.UserDeliveryContact;

public interface UserMapper {

	public int deleteUser(@Param("userId") int userId);

	public List<User> getAllUsers();

	public User getUserForId(@Param("userId") int userId);

	public int createUser(@Param("user") User user);

	public int updateUser(@Param("user") User user);
	
	public int insertUserDeliveryContact(@Param("userDeliveryContact") UserDeliveryContact userDeliveryContact);
	
	public int deleteUserDeliveryContact(@Param("userDeliveryContactId") int userDeliveryContactId);
	
	public int deleteAllUserDeliveryContactsForUserId(@Param("userId") int userId);
	
	public int updateUserDeliveryContact(@Param("userDeliveryContact") UserDeliveryContact userDeliveryContact);
	
}
