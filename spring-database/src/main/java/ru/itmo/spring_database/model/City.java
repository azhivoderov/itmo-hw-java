package ru.itmo.spring_database.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class City {

    private Long id;
    private String nameRU;
    private String nameEN;
    private Integer numberResidents;
    private Integer regionId;

    public City(Long id, String nameRU, String nameEN, Integer numberResidents, Integer regionId) {
        this.id = id;
        this.nameRU = nameRU;
        this.nameEN = nameEN;
        this.numberResidents = numberResidents;
        this.regionId = regionId;
    }

}
