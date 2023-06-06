package com.zak.customerdatamanagement.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zak.customerdatamanagement.entity.Person;

@Repository
public class PersonDAO {
	@Autowired
	private PersonRepository repository;
	
	public Person save(Person person) {
		return repository.save(person);
	}

}
