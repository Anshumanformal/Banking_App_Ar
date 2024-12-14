package com.bank.banking_app_ar.dto;

import lombok.*;

@Data
//@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private double balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountDto(Long id, String accountHolderName, double balance){
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
