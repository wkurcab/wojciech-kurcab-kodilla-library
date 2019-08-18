package com.kodilla.library.mapper;

import com.kodilla.library.domain.Reader;
import com.kodilla.library.domain.ReaderDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderMapper {
    public Reader mapToReader (final ReaderDto readerDto) {
        return new Reader(
                readerDto.getId(),
                readerDto.getName(),
                readerDto.getSurname(),
                readerDto.getDateOfAccountCreation());
    }

    public ReaderDto mapToReaderDto (final Reader reader) {
        return new ReaderDto(
                reader.getId(),
                reader.getName(),
                reader.getSurname(),
                reader.getDateOfAccountCreation());
    }

    public List<ReaderDto> mapToReaderDtoList (final List<Reader> readerList) {
        return readerList.stream()
                .map(r -> new ReaderDto(r.getId(), r.getName(), r.getSurname(), r.getDateOfAccountCreation()))
                .collect(Collectors.toList());
    }
}
