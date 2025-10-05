package ru.itmo.jpa.dao.Impl;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.itmo.jpa.dao.CityDao;
import ru.itmo.jpa.model.City;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CityDaoImpl implements CityDao {

    private final EntityManager em;

    @Override
    @Transactional
    public Long create(Long id, String nameRU,  String nameEN, Integer numberResidents, Long regionId) {
        City city = new City(id, nameRU, nameEN, numberResidents, regionId);
        em.persist(city);
        return city.getId();
    }

    @Override
    @Transactional
    public void updateById(Long id, String nameRU, String nameEN, Integer numberResidents) {
        City city = em.find(City.class, id);
        city.setNameRU(nameRU);
        city.setNameEN(nameEN);
        city.setNumberResidents(numberResidents);
        em.merge(city);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if (em.find(City.class, id) != null) {
            em.remove(em.find(City.class, id));
        }
    }

    @Override
    public Optional<City> findById(Long id) {
        return Optional.ofNullable(em.find(City.class, id));
    }

}
