package com.app.salonbooking.services.impl;

import com.app.salonbooking.models.Customer;
import com.app.salonbooking.repositories.CustomerRepository;
import com.app.salonbooking.services.CustomerService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private  CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
	@Autowired
	private JavaMailSender mailSender;
	public void sendmail(String toMail,String body,String Subject) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("ModernSaloon");
		message.setSubject(Subject);
		message.setTo(toMail);
		message.setText(body);
		
		mailSender.send(message);
		System.out.println("send");
	}
	
}
