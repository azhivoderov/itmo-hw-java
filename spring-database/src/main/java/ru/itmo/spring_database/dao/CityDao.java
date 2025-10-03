package ru.itmo.spring_database.dao;

import ru.itmo.spring_database.model.City;

import java.util.Optional;

public interface CityDao {
    Long create(Long id, String name_ru, String name_en, Integer number_residents, Integer region_id);
    void updateById(Long id, String name_ru, String name_en, Integer number_residents, Integer region_id);
    void deleteById(Long id);
    Optional<City> findById(Long id);
}
