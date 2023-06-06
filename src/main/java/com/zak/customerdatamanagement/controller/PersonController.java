package com.zak.customerdatamanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zak.customerdatamanagement.entity.Person;
import com.zak.customerdatamanagement.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired 
	private PersonService service;
	
	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}

}
