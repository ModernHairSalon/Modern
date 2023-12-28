package com.app.salonbooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.salonbooking.models.SignIn;


public interface SignInRepo extends JpaRepository<SignIn, Integer> {
	public SignIn findByeMail(String email);

}
