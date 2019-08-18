package com.kodilla.library.mapper;

import com.kodilla.library.domain.CopyOfBook;
import com.kodilla.library.domain.CopyOfBookDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CopyOfBookMapper {
    public CopyOfBook mapToCopyOfBook (final CopyOfBookDto copyOfBookDto) {
        return new CopyOfBook(
                copyOfBookDto.getId(),
                copyOfBookDto.getIdTitle(),
                copyOfBookDto.getStatus());
    }

    public CopyOfBookDto mapToCopyOfBookDto (final CopyOfBook copyOfBook) {
        return new CopyOfBookDto(
                copyOfBook.getId(),
                copyOfBook.getIdTitle(),
                copyOfBook.getStatus());
    }

    public List<CopyOfBookDto> mapToCopyOfBookDtoList (final List<CopyOfBook> copyOfBookList) {
        return copyOfBookList.stream()
                .map(c -> new CopyOfBookDto(c.getId(), c.getIdTitle(), c.getStatus()))
                .collect(Collectors.toList());
    }
}
