package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.Repository.Userrepository;

@Service
public class Userservice {
	
	@Autowired
	private Userrepository userRepository;

	public void addContact(@Valid User contact) {
		userRepository.save(contact);
		
	}

}