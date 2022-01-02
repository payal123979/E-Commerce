package com.ecommerce.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.registration.entities.RegistrationEntity;
import com.ecommerce.registration.service.RegistrationService;

@RestController
public class RegistartionController {
	
	@Autowired
	private RegistrationService registrationService;

	@PostMapping("/register")
	public String registerDetails(@RequestBody RegistrationEntity registerdetails) {
		String result = registrationService.saveRegistrationDetails(registerdetails);
		return result;
	}
	
	
}
