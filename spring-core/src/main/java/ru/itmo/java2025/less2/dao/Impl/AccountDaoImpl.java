package ru.itmo.java2025.less2.dao.Impl;

import org.springframework.stereotype.Component;
import ru.itmo.java2025.less2.dao.AccountDao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class AccountDaoImpl implements AccountDao {

    public static final Map<String, BigDecimal> ACCOUNTS = new HashMap<>();

    @Override
    public void deposit(String accountNumber, BigDecimal amount) {
        BigDecimal value = ACCOUNTS.computeIfAbsent(accountNumber, k -> new BigDecimal(0)).add(amount);
        ACCOUNTS.put(accountNumber, value);
    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount) {
        deposit(accountNumber, amount.multiply(new BigDecimal(-1)));
    }
}
