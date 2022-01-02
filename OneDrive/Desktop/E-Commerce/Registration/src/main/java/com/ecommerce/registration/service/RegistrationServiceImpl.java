package com.ecommerce.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.registration.entities.RegistrationEntity;
import com.ecommerce.registration.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;

	@Override
	public String saveRegistrationDetails(RegistrationEntity registerDetails) {
		RegistrationEntity registerDet = registrationRepository.save(registerDetails);
		if(registerDet!=null) {
			return "Success";
		}
		return "Failed";
	}
	
	

}
