package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HireDto {
    private Long idCopyOfBook;
    private Long idReader;
    private LocalDateTime dateOfHire;
    private LocalDateTime dateOfReturn;
}
