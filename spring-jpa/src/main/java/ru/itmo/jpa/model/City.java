package ru.itmo.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "cities")
public class City {

    @Id
    private Long id;
    @Column (name = "name_ru")
    private String nameRU;
    @Column (name = "name_en")
    private String nameEN;
    @Column (name = "number_residents")
    private Integer numberResidents;
    @Column (name = "region_id")
    private Long regionId;

}
