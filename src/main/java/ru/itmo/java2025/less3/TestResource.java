package ru.itmo.java2025.less3;

import jakarta.annotation.Resource;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class TestResource {
    @Value("${itmo.numValue}")
    private Integer numValue;
}
