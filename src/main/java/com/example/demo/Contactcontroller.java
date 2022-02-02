package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.Service.Userservice;

@RestController
public class Contactcontroller {
	
	@Autowired
	private Userservice userService;
	
	@PostMapping("/addingContact")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addContact(@RequestBody @Valid User contact) {
		userService.addContact(contact);
	}

}
