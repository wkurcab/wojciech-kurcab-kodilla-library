package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TitleDto {
    private Long id;
    private String title;
    private String author;
    private int yearOfPublishment;
}
