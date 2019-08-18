package com.kodilla.library.repository;

import com.kodilla.library.domain.CopyOfBook;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CopyOfBookRepository extends CrudRepository<CopyOfBook, Long> {
    @Override
    List<CopyOfBook> findAll();

    @Override
    CopyOfBook save(CopyOfBook reader);

    @Override
    Optional<CopyOfBook> findById(Long id);

    @Override
    void deleteById(Long id);
}
