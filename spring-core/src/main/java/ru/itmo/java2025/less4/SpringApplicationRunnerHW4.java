package ru.itmo.java2025.less4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.java2025.less2_HW2.Converter;

@SpringBootApplication
public class SpringApplicationRunnerHW4 {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContextHW4 = SpringApplication.run(SpringApplicationRunnerHW4.class, args)){
            System.out.println("Hello World");
        }
    }
}
