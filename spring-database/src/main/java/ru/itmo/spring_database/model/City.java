package ru.itmo.spring_database.model;

import lombok.*;

@ToString
@Data
public class City {
    private Long id;
    private String name_ru;
    private String name_en;
    private Integer number_residents;
    private Integer region_id;

    public City(Long id, String name_ru, String name_en, Integer number_residents, Integer region_id) {
        this.id = id;
        this.name_ru = name_ru;
        this.name_en = name_en;
        this.number_residents = number_residents;
        this.region_id = region_id;
    }

}
