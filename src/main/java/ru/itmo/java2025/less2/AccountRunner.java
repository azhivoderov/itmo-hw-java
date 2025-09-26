package ru.itmo.java2025.less2;

import ru.itmo.java2025.less2.service.Impl.AccountService;
import ru.itmo.java2025.less2.service.Impl.AccountServiceImpl;
import ru.itmo.java2025.less2.service.Impl.FakeAccountService;

import java.math.BigDecimal;

public class AccountRunner {
    public static void main(String[] args) {
        String accountNumber = "1234567890";

        AccountService accountService = new FakeAccountService();
        accountService.deposit(accountNumber, new BigDecimal(1000));
        accountService.withdraw(accountNumber, new BigDecimal(500));
        accountService.deposit(accountNumber, new BigDecimal(200));
        System.out.println(accountService.getBalance(accountNumber));
    }
}
