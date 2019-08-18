package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReaderDto {
    private Long id;
    private String name;
    private String surname;
    private LocalDateTime dateOfAccountCreation;
}
