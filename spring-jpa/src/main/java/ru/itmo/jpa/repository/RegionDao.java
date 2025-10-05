package ru.itmo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.jpa.model.Region;

public interface RegionDao extends JpaRepository<Region, Long> {
}
