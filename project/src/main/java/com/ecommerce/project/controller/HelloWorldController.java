package com.ecommerce.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/records")
public class HelloWorldController {

	@RequestMapping(value = "/getString", method = RequestMethod.GET, produces = "application/json")
	public String hello() {
		return "{\"id\":\"1\"}";

	}

}