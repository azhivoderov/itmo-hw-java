package ru.itmo.java2025.less2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.java2025.less2.service.Impl.AccountService;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringApplicationRunner {
    public static void main(String[] args) {
        String accountNumber = "1234567890";

      try (ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringApplicationRunner.class, args)){
          AccountService accountService = applicationContext.getBean("accountServiceImpl", AccountService.class);
          accountService.deposit(accountNumber, new BigDecimal(1000));
          accountService.withdraw(accountNumber, new BigDecimal(500));
          accountService.deposit(accountNumber, new BigDecimal(200));
          System.out.println(accountService.getBalance(accountNumber));
      }
    }
}
