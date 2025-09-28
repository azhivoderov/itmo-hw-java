package ru.itmo.java2025.less3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApplicationRunnerHW3 {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContextHW3 = SpringApplication.run(SpringApplicationRunnerHW3.class, args)){
            TestResource testResource = applicationContextHW3.getBean(TestResource.class);
            System.out.printf("numValue=%s\n", testResource.getNumValue());
        }

    }
}
