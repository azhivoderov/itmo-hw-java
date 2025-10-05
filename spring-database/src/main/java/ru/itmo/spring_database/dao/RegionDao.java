package ru.itmo.spring_database.dao;

import ru.itmo.spring_database.model.City;

import java.util.Optional;

public interface RegionDao {
    Long create(Long id, String nameRU, String nameEN, Integer numberResidents, Integer regionId);
    void updateById(Long id, String nameRU, String nameEN, Integer numberResidents, Integer regionId);
    void deleteById(Long id);
    Optional<City> findById(Long id);
}
