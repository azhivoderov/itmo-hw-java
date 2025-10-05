package ru.itmo.jpa.dao;

import ru.itmo.jpa.model.City;

import java.util.Optional;

public interface CityDao {
    Long create(String nameRU, String nameEN, Integer numberResidents, Long regionId);
    void updateById(Long id, String nameRU, String nameEN, Integer numberResidents);
    void deleteById(Long id);
    Long assignToRegion(Long id, Long regionId);
    Optional<City> findById(Long id);

}
