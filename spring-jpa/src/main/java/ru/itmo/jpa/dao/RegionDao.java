package ru.itmo.jpa.dao;

import ru.itmo.jpa.model.Region;

import java.util.Optional;

public interface RegionDao {
    Long create(Integer code);
    void updateById(Long id, Integer code);
    void deleteById(Long id);
    Optional<Region> findById(Long id);
    Optional<Region> findByCode(Integer code);

}
