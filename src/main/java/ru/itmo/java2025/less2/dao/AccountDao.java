package ru.itmo.java2025.less2.dao;

import java.math.BigDecimal;

public interface AccountDao {
    void deposit(String accountNumber, BigDecimal amount);
    void withdraw(String accountNumber, BigDecimal amount);
}
