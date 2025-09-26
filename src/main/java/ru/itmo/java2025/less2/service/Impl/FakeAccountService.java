package ru.itmo.java2025.less2.service.Impl;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class FakeAccountService implements AccountService {

    @Override
    public void deposit(String accountNumber, BigDecimal amount) {

    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount) {

    }

    @Override
    public BigDecimal getBalance(String accountNumber) {
        return null;
    }
}
