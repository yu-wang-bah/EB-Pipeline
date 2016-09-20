package com.bah.controller;

import org.springframework.web.bind.annotation.RestController;

import com.bah.domain.VehicleIdentificationNumber;
import com.bah.service.RemoteVehicleDetailsService;
import com.bah.service.VehicleDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	private RemoteVehicleDetailsService remoteVehicleDetailsService;
	
	@Autowired
	public HelloController(RemoteVehicleDetailsService remoteVehicleDetailsService){
		this.remoteVehicleDetailsService=remoteVehicleDetailsService;
	}

	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Shawn!";
    }
    
    @RequestMapping(value = "/topbrand", headers="Accept=application/json")
	public List<VehicleDetails> VehicleDetailsJson() {
		return this.remoteVehicleDetailsService.getTopBrand();
	}
}
