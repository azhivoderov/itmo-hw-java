package ru.itmo.java2025.less2_HW2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.java2025.less2_HW2.impl.ConverterImpl;
import ru.itmo.java2025.less2_HW2.impl.ConverterUnits;

import java.util.Arrays;

@SpringBootApplication
public class SpringApplicationRunnerHW2 {
    public static void main(String[] args) {
       try (ConfigurableApplicationContext applicationContextHW2 = SpringApplication.run(SpringApplicationRunnerHW2.class, args)){
            Converter converter = applicationContextHW2.getBean(Converter.class);
            System.out.println(converter.conv(10, ConverterUnits.CELSIUS,ConverterUnits.FAHRENHEIT));
       }
    }
}
