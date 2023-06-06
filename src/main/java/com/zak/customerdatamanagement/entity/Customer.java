package com.zak.customerdatamanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zak.customerdatamanagement.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer_info")
public class Customer implements Serializable{
	
	public static int getId;

	public Customer(int i, int value, String name2, String name3) {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	private String email;
	
	public Customer(CustomerDTO dto) {
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

//	public Integer getId() {
//		return null;
//	}
//
//	public String getName() {
//		return null;
//	}
//
//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return null;
//	}	
}
