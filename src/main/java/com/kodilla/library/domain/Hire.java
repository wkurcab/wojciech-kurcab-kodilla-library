package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "hires")
public class Hire {

    @Column(name = "id_copy_of_book")
    private Long idCopyOfBook;

    @Column(name = "id_reader")
    private Long idReader;

    @Column(name = "date_of_hire")
    private LocalDateTime dateOfHire;

    @Column(name = "date_of_return")
    private LocalDateTime dateOfReturn;
}
