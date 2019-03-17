package com.soham.trialBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soham.trialBoot.dao.UserDao;
import com.soham.trialBoot.model.User;


//@RequestMapping(value = "/records")
/*@ComponentScan
@EnableAutoConfiguration*/
@RestController
public class HelloWorldController {

	
	@Autowired
	UserDao userDoa;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public List<User> hello() {
		
		return userDoa.selectAllUsers();
	}

}