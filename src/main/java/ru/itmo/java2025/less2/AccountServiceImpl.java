package ru.itmo.java2025.less2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountServiceImpl implements AccountService {

    private static final AccountService INSTANCE = new AccountServiceImpl();
    private static final Map<String, BigDecimal> ACCOUNTS = new HashMap<>();

    @Override
    public void deposit(String accountNumber, BigDecimal amount) {
        BigDecimal value = ACCOUNTS.computeIfAbsent(accountNumber, k -> new BigDecimal(0)).add(amount);
        ACCOUNTS.put(accountNumber, value);
    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount) {
        deposit(accountNumber, amount.multiply(new BigDecimal(-1)));
    }

    @Override
    public BigDecimal getBalance(String accountNumber) {
        return ACCOUNTS.get(accountNumber);
    }

    private static AccountService getInstance() {
        return INSTANCE;
    }
}
