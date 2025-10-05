package ru.itmo.spring_database.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Region {

    private Long id;
    private Integer codeRegion;

    public Region(Long id, Integer codeRegion) {
        this.id = id;
        this.codeRegion = codeRegion;
    }

}
