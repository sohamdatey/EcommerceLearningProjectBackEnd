package com.onlinerestaurant.foodie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinerestaurant.foodie.dao.UserDao;
import com.onlinerestaurant.foodie.model.User;


@RestController
public class UserController {

	@Autowired
	UserDao userDoa;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	public List<User> hello() {
		
		return userDoa.selectAllUsers();
	}
	
	@RequestMapping(value = "/user/id", method = RequestMethod.GET, produces = "application/json")
	User getUserByValue(@RequestParam(value = "id") int id) {
		return userDoa.selectUser(id);
    }	
	

}