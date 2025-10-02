package ru.itmo.spring_database.dao.Impl;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itmo.spring_database.dao.GroupDao;
import ru.itmo.spring_database.model.Group;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class GroupDaoImpl implements GroupDao {

    private final JdbcTemplate jdbcTemplate;

    @SneakyThrows
    @Override
    public Long create(Long id, String name) {
        jdbcTemplate.update("""
            insert into groups (id, name) values (?, ?)
       """, id, name);
        return id;
    }

    @Override
    public void updateNameById(Long id, String name){
        jdbcTemplate.update("""
            update groups set name
            where id = ?
        """, name, id);
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update("""
            delete from groups
            where id = ?
        """, id);
    }

    @Override
    public List<Group> findAll() {
        return jdbcTemplate.query("""
                select id, name from groups
                """, (rs, rowNum) -> new Group(rs.getLong("id"), rs.getString("name"))
        );
    }

    @Override
    public Optional<Group> findById(Long id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("""
                select id, name from groups
                where id = ?
                """,
                (rs, rowNum) -> new Group(rs.getLong("id"), rs.getString("name"))
        ));
    }
}
