package com.kodilla.library.mapper;

import com.kodilla.library.domain.Title;
import com.kodilla.library.domain.TitleDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TitleMapper {
    public Title mapToTitle (final TitleDto titleDto) {
        return new Title(
                titleDto.getId(),
                titleDto.getTitle(),
                titleDto.getAuthor(),
                titleDto.getYearOfPublishment());
    }

    public TitleDto mapToTitleDto (final Title title) {
        return new TitleDto(
                title.getId(),
                title.getTitle(),
                title.getAuthor(),
                title.getYearOfPublishment());
    }

    public List<TitleDto> mapToTitleDtoList (final List<Title> titleList) {
        return titleList.stream()
                .map(t -> new TitleDto(t.getId(), t.getTitle(), t.getAuthor(), t.getYearOfPublishment()))
                .collect(Collectors.toList());
    }
}
