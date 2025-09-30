package ru.itmo.java2025.less3_HW3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.java2025.less3_HW3.resources.AppResources;
import ru.itmo.java2025.less3_HW3.service.FibonacciService;

import java.math.BigInteger;
import java.util.Scanner;

@SpringBootApplication
public class 5SpringApplicationRunnerHW3 {

    static Integer n;

    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContextHW3 = SpringApplication.run(SpringApplicationRunnerHW3.class, args)) {
            FibonacciService fibonacciService = applicationContextHW3.getBean(FibonacciService.class);

            Scanner scanner = new Scanner(System.in);

                while (true) try {
                    System.out.print("\nВведите число (n): ");
                    String input = scanner.nextLine().trim();
                    int n = Integer.parseInt(input);
                    BigInteger result = fibonacciService.getFibonacci(n);
                    System.out.println("   F(" + n + ") = " + result);

                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

        }

    }
}
