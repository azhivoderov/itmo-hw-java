package ru.itmo.java2025.less2.dao.Impl;

import org.springframework.stereotype.Component;
import ru.itmo.java2025.less2.dao.AccountDao;

import java.math.BigDecimal;

@Component
public class DbAccountDaoImpl implements AccountDao {

    @Override
    public void deposit(String accountNumber, BigDecimal amount) {

    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount) {

    }
}
