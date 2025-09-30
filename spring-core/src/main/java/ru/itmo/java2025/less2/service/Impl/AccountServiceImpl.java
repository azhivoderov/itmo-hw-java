package ru.itmo.java2025.less2.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itmo.java2025.less2.dao.AccountDao;

import java.math.BigDecimal;

import static ru.itmo.java2025.less2.dao.Impl.AccountDaoImpl.ACCOUNTS;

@Component
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao;

    @Override
    public void deposit(String accountNumber, BigDecimal amount) {
        accountDao.deposit(accountNumber, amount);
    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount) {
        accountDao.withdraw(accountNumber, amount);
    }

    @Override
    public BigDecimal getBalance(String accountNumber) {
        return ACCOUNTS.get(accountNumber);
    }

/*    public static AccountService getInstance() {
        return INSTANCE;
    }*/
}
