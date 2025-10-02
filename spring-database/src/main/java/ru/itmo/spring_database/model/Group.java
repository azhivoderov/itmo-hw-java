package ru.itmo.spring_database.model;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    private Long id;
    private String name;

    public Group(long id, String name) {
    }
}
