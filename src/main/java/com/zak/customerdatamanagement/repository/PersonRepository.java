package com.zak.customerdatamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zak.customerdatamanagement.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
