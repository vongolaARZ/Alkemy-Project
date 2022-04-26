package com.disney.api.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieSerieDto {


    private String image;
    private String titulo;
    private LocalDateTime ageOfCreation;
}
