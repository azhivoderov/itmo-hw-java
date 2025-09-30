package ru.itmo.spring_database.model;

import lombok.Data;
import lombok.ToString;

import java.util.Set;

@ToString
@Data
public class Student {
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Long groupId;
}
