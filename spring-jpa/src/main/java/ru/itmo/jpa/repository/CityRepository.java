package ru.itmo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.itmo.jpa.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {

    @Modifying
    @Query("""
        update Region r set r.name = :nameRu
            where r.code = :codeCity
        """)
    void updateById(long codeCity, String nameRu, String nameEn, Integer numberResidents);

}
