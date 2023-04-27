package com.nagarro.prafful.rastogi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class contorllers {
	@GetMapping("hello")
	public String HelloWorld() {
		String text= "hello, my name is prafful rastogi";
		return text;
	}

}