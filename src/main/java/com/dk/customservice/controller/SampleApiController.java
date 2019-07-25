package com.dk.customservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleApiController {

	@RequestMapping("/hello")
	public @ResponseBody String hello(@RequestParam String user) {
		return "Hello "+ user;
	}
	
}
