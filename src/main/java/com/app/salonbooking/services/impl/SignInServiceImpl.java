package com.app.salonbooking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.salonbooking.models.SignIn;
import com.app.salonbooking.repositories.SignInRepo;
import com.app.salonbooking.services.SignInService;
@Service
public class SignInServiceImpl implements SignInService {
	@Autowired
	private SignInRepo sir;

	@Override
	public int loginValidation(SignIn signIN) {
		SignIn info = sir.findByeMail(signIN.getEMail());
		if (info.getPassword().equals(signIN.getPassword()))
			return 1;

		return 0;

	}
}
