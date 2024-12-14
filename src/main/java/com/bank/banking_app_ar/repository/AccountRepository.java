package com.bank.banking_app_ar.repository;

import com.bank.banking_app_ar.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
