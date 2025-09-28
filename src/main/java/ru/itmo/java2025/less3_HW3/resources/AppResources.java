package ru.itmo.java2025.less3_HW3.resources;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class AppResources {
    @Value("${fibonacci.cacheEnabled}")
    private boolean cacheEnabled;
}
