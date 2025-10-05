package ru.itmo.jpa.dao;

import ru.itmo.jpa.model.City;

import java.util.Optional;

public interface CityDao {
    Long create(Long id, String nameRU, String nameEN, Integer numberResidents, Long regionId);
    void updateById(Long id, String nameRU, String nameEN, Integer numberResidents);
    void deleteById(Long id);
    Optional<City> findById(Long id);
}
