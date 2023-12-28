package com.app.salonbooking.services;


import org.springframework.beans.factory.annotation.Autowired;


import com.app.salonbooking.models.Customer;

public interface CustomerService {
    Customer save(Customer customer);

	public void sendmail(String toMail,String body,String Subject) ;
		
	
	
}
