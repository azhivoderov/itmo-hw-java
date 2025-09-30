package ru.itmo.spring_database.dao.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.itmo.spring_database.dao.GroupDao;
import ru.itmo.spring_database.model.Group;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor

public class GroupDaoImpl implements GroupDao {
    @Override
    public Long create(Long id, String name) {
        Class.forName("org.postgresql.Driver");
        return 0L;
    }

    @Override
    public void updateNameById(Long id, String name){

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Group> findAll() {
        return List.of();
    }

    @Override
    public Optional<Group> findById(Long id) {
        return Optional.empty();
    }
}
