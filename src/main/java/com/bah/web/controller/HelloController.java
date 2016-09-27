package com.bah.web.controller;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	public static String greeting = "Greetings from Spring Boot!";
	
    @RequestMapping("/")
    public String index() {
        return greeting;
    }
    
}
