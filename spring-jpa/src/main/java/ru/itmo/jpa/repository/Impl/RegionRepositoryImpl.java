package ru.itmo.jpa.repository.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import ru.itmo.jpa.model.Region;
import ru.itmo.jpa.repository.RegionRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
@RequiredArgsConstructor
public class RegionRepositoryImpl implements RegionRepository {

    @Override
    public void flush() {

    }

    @Override
    public <S extends Region> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Region> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Region> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Region getOne(Long aLong) {
        return null;
    }

    @Override
    public Region getById(Long aLong) {
        return null;
    }

    @Override
    public Region getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Region> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Region> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Region> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Region> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Region> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Region> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Region, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Region> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Region> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Region> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Region> findAll() {
        return List.of();
    }

    @Override
    public List<Region> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Region entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Region> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Region> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Region> findAll(Pageable pageable) {
        return null;
    }
}
