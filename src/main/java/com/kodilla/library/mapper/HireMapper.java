package com.kodilla.library.mapper;

import com.kodilla.library.domain.Hire;
import com.kodilla.library.domain.HireDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HireMapper {
    public Hire mapToHire (final HireDto hireDto) {
        return new Hire(
                hireDto.getIdCopyOfBook(),
                hireDto.getIdReader(),
                hireDto.getDateOfHire(),
                hireDto.getDateOfReturn());
    }

    public HireDto mapToHireDto (final Hire hire) {
        return new HireDto(
                hire.getIdCopyOfBook(),
                hire.getIdReader(),
                hire.getDateOfHire(),
                hire.getDateOfReturn());
    }

    public List<HireDto> mapToHireDtoList (final List<Hire> hireList) {
        return hireList.stream()
                .map(h -> new HireDto(h.getIdCopyOfBook(), h.getIdReader(), h.getDateOfHire(), h.getDateOfReturn()))
                .collect(Collectors.toList());
    }
}
