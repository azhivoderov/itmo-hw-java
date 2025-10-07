package ru.itmo.jpa.repository.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import ru.itmo.jpa.model.City;
import ru.itmo.jpa.repository.CityRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
@RequiredArgsConstructor
public class CityRepositoryImpl implements CityRepository {

    @Override
    public void updateById(long codeCity, String nameRu, String nameEn, Integer numberResidents) {

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends City> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends City> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<City> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public City getOne(Integer integer) {
        return null;
    }

    @Override
    public City getById(Integer integer) {
        return null;
    }

    @Override
    public City getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends City> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends City> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends City> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends City> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends City> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends City> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends City, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends City> S save(S entity) {
        return null;
    }

    @Override
    public <S extends City> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<City> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<City> findAll() {
        return List.of();
    }

    @Override
    public List<City> findAllById(Iterable<Integer> integers) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(City entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends City> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<City> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<City> findAll(Pageable pageable) {
        return null;
    }
}
