package com.bah.web.controller;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	public static final String greeting = "Welcome to devops pipeline demo using cloud, have a nice day!";
	
    @RequestMapping("/")
    public String index() {
        return greeting;
    }
    
}
