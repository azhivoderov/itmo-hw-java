package ru.itmo.java2025.less2;

import java.math.BigDecimal;

public interface AccountService {
    void deposit(String accountNumber, BigDecimal amount);
    void withdraw(String accountNumber, BigDecimal amount);
    BigDecimal getBalance(String accountNumber);
}
