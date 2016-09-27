package com.bah.web.controller;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	public static final String greeting = "Welcome to devop pipeline demo using cloud!";
	
    @RequestMapping("/")
    public String index() {
        return greeting;
    }
    
}
