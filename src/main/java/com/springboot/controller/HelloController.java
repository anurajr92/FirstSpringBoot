package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	
	@RequestMapping(value="/test")
	public String getHelloResp() {
		return "poda pulle";
	}

}
