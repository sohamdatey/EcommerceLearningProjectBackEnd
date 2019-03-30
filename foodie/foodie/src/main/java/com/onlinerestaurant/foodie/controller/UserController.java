package com.onlinerestaurant.foodie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinerestaurant.foodie.dao.UserDao;
import com.onlinerestaurant.foodie.model.User;


@RestController
public class UserController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
	User getUserForId(@RequestParam(value = "userId") int userId) {
		return userDao.getUserForId(userId);
    }	
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
	int createUser(@RequestBody User user) {
		return userDao.createUser(user);
		
    }
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST, produces = "application/json")
	int updateUser(@RequestBody User user) {
		return userDao.updateUser(user);
    }
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST, produces = "application/json")
	int deleteUser(@RequestParam(value = "userId") int userId) {
		return userDao.deleteUser(userId);
    }

}