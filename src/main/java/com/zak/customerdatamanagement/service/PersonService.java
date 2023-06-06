package com.zak.customerdatamanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zak.customerdatamanagement.entity.Person;
import com.zak.customerdatamanagement.repository.PersonDAO;

@Service
public class PersonService {
	@Autowired
	private PersonDAO dao;
	
	public Person savePerson(Person person) {
		return dao.save(person);
	}

}
