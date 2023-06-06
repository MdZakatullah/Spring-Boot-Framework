package com.zak.customerdatamanagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.zak.customerdatamanagement.dto.CustomerDTO;
import com.zak.customerdatamanagement.dto.ResponseSrtucture;
import com.zak.customerdatamanagement.entity.Customer;
import com.zak.customerdatamanagement.repository.CustomerDAO;
import com.zak.customerdatamanagement.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	public ResponseSrtucture<Customer> saveCustomer(CustomerDTO dto) {
		Customer cus = new Customer(dto);
		Customer customer = dao.saveCustomer(cus);
		ResponseSrtucture<Customer> rs=new ResponseSrtucture<>();
		rs.setData(customer);
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Customer data saved successfully");
		rs.setTimeStamp(LocalDateTime.now());
		return rs;
	}
	
	public ResponseSrtucture<Customer> updateCustomer(Customer customer) {
		Customer cus= dao.saveCustomer(customer);
		ResponseSrtucture<Customer> rs = new ResponseSrtucture<>();
		rs.setData(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}
	
	public ResponseSrtucture<List<Customer>> getAllCustomerData() {
		List<Customer> list= dao.getAllCustomerData();
		ResponseSrtucture<List<Customer>> rs=new ResponseSrtucture<>();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("Customer entry found in database");
		}else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("No Customer entry found in database");
		}
		return rs;
	}
	
	public Customer getCustomerDataById(int id) {
		return dao.getCustomerDataById(id);
	}
	
	public Customer deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}
	
	public List<Customer> getCustomerByName(String name) {
		return dao.getCustomerByName(name);
	}
	
	public List<Customer> validateCustomer(String name, String email) {
		return dao.validateCustomer(name, email);
	}

}
