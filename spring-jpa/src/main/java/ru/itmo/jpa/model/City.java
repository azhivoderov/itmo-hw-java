package ru.itmo.jpa.model;

import jakarta.persistence.*;
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
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_id_seq")
    @SequenceGenerator(name = "city_id_seq", sequenceName = "city_id_seq", allocationSize = 1)
    private Long id;
    @Column (name = "name_ru")
    private String nameRU;
    @Column (name = "name_en")
    private String nameEN;
    @Column (name = "number_residents")
    private Integer numberResidents;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region regionId;

}
