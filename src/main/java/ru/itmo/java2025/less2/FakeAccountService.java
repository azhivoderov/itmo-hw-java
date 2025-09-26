package ru.itmo.java2025.less2;

import java.math.BigDecimal;

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
