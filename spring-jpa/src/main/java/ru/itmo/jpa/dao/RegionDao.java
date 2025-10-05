package ru.itmo.jpa.dao;

import ru.itmo.jpa.model.Region;

import java.util.Optional;

public interface RegionDao {
    Long create(Integer code, String name);
    void updateById(Long id, Integer code,  String name);
    void deleteById(Long id);
    Optional<Region> findById(Long id);
    Optional<Region> findByCode(Integer code);
}
