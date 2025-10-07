package ru.itmo.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.jpa.repository.CityRepository;

@SpringBootApplication
public class CascadeRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CascadeRunner.class, args);
        CityRepository cityRepository = applicationContext.getBean(CityRepository.class);
    }
}
