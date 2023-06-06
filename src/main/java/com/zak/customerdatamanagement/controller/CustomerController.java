package com.zak.customerdatamanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zak.customerdatamanagement.dto.CustomerDTO;
import com.zak.customerdatamanagement.dto.ResponseSrtucture;
import com.zak.customerdatamanagement.entity.Customer;
import com.zak.customerdatamanagement.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public @ResponseBody ResponseSrtucture<Customer> saveCustomer(@RequestBody CustomerDTO dto){
		return service.saveCustomer(dto);
	}
	
	@PutMapping("/customer")
	public @ResponseBody ResponseSrtucture<Customer> updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	
	@GetMapping("/customer")
	public @ResponseBody ResponseSrtucture<List<Customer>> getAllCustomerData() {
		return service.getAllCustomerData();
	}
	
	@GetMapping("/customer/{id}")
	public @ResponseBody Customer getCustomerDataBy(@PathVariable("id") int id) {
		return service.getCustomerDataById(id);
	}
	
	@DeleteMapping("/customer")
	public @ResponseBody Customer deleteCustomerDataById(@RequestParam("id")int id) {
		return service.deleteCustomerDataById(id);
	}
	
	@GetMapping("/customerbyname/{name}")
	public @ResponseBody List<Customer> getCustomerByName(@PathVariable("name")String name) {
		return service.getCustomerByName(name);
	}
	
//	public List<Customer> validateCustomer(String name, String email){
//		return null;
//	}
	
	@PostMapping("/validatecustomer")
	public List<Customer> validateCustomer(@RequestParam("name")String name, @RequestParam("email")String email) {
		return service.validateCustomer(name, email);
	}
	
}
