package com.zak.customerdatamanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.zak.customerdatamanagement.dto.CustomerDTO;
import com.zak.customerdatamanagement.entity.Customer;

@Repository
public class CustomerDAO {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer cus) {
		return repository.save(cus);
	}
	
	public List<Customer> getAllCustomerData() {
		return repository.findAll();
	}
	
	public Customer getCustomerDataById(int id) {
		return repository.findById(id).orElse(new Customer(0,HttpStatus.NOT_FOUND.value()
				,HttpStatus.NOT_FOUND.name(),
				HttpStatus.NOT_FOUND.name()));
	}
	
	public Customer deleteCustomerDataById(int id) {
		Customer customer = getCustomerDataById(id);
		if(Customer.getId!=404) {
			repository.deleteById(id);
		}
		return customer;
	}
	
	public List<Customer> getCustomerByName(String name) {
		return repository.findByName(name);
	}
	
	public List<Customer> validateCustomer(String name, String email) {
		return repository.validateCustomer(name, email);
	}

}
