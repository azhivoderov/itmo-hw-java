package ru.itmo.spring_database.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Group {
    private Long id;
    private String name;
}
