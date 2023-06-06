package com.zak.customerdatamanagement.dto;

import java.io.Serializable;

import com.zak.customerdatamanagement.entity.Customer;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable{
	
    private Integer id;
	private String name;
	private String email;
	
//	public CustomerDTO(Customer customer) {
//		this.id=customer.getId();
//		this.name=customer.getName();
//		this.email=customer.getEmail();
//	}

	public Integer getId() {
		return null;
	}

	public String getName() {
		return null;
	}

	public String getEmail() {
		return null;
	}

}
