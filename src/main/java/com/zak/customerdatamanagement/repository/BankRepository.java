package com.zak.customerdatamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zak.customerdatamanagement.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, Integer>{

}
