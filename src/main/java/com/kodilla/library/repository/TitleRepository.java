package com.kodilla.library.repository;

import com.kodilla.library.domain.Title;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TitleRepository extends CrudRepository<Title, Long> {
    @Override
    List<Title> findAll();

    @Override
    Title save(Title reader);

    @Override
    Optional<Title> findById(Long id);

    @Override
    void deleteById(Long id);
}
