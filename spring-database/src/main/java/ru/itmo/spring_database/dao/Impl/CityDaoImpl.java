package ru.itmo.spring_database.dao.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itmo.spring_database.dao.CityDao;
import ru.itmo.spring_database.model.City;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CityDaoImpl implements CityDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Long create(Long id, String nameRU,  String nameEN, Integer numberResidents, Integer regionId) {
        jdbcTemplate.update("""
            insert into cities (id,
                                name_ru,
                                name_en,
                                number_residents,
                                region_id)
            values (?,?,?,?,?)
       """, id, nameRU,  nameEN, numberResidents, regionId);
        return id;
    }

    @Override
    public void updateById(Long id, String nameRU, String nameEN, Integer numberResidents, Integer regionId) {
        jdbcTemplate.update("""
            update cities set name_ru = ?, name_en = ?, number_residents = ?, region_id = ?
            where id = ?
        """, nameRU,  nameEN, numberResidents, regionId, id);
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update("""
            delete from cities
            where id = ?
        """, id);
    }

    @Override
    public Optional<City> findById(Long id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("""
                select id, name_ru  from cities
                where id = ?
                """,
                (rs, rowNum) -> new City(rs.getLong("id"), rs.getString("NameRU"), rs.getString("NameEN"), rs.getInt("NumberResidents"), rs.getInt("Regionid") )
        ));
    }

}
