package com.gw.hrconnectapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.gw.hrconnect.service.api.SkillService;

@RestController
public class CountryMasterRestController {

	
	@Autowired
	private SkillService countryService;
	
	@GetMapping("/welcome")
	  public String welcome() {
		countryService.findByCountryId();
		return "helloooooo";
	}
	

	@GetMapping("/getcountrybyid/{id}")
	public void getCountryById(@PathVariable("id") int id) {
		System.out.println("------------- id" +id);
		countryService.findByCountryId(id);
		
	} 
	
}
