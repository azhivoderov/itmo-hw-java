package ru.itmo.jpa.repository.Impl;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.itmo.jpa.repository.RegionDao;
import ru.itmo.jpa.model.Region;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RegionDaoImpl implements RegionDao {

    private final EntityManager em;

    @Override
    @Transactional
    public Long create(Integer code, String name) {
        Region region = new Region();
        region.setCode(code);
        region.setName(name);
        em.persist(region);
        return region.getId();
    }

    @Override
    @Transactional
    public void updateById(Long id, Integer code, String name) {
        Region region = em.find(Region.class, id);
        region.setCode(code);
        region.setName(name);
        em.merge(region);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        em.remove(em.find(Region.class, id));
    }

    @Override
    public Optional<Region> findById(Long id) {
        return Optional.ofNullable(em.find(Region.class, id));
    }

    @Override
    public Optional<Region> findByCode(Integer code) {
        return Optional.ofNullable(em.find(Region.class, code));
    }

}
