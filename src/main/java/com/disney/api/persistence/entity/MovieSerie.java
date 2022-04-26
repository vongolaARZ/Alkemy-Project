package com.disney.api.persistence.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "movie_serie")
public class MovieSerie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovieSerie;

    @Column(name = "image")
    private String image;

    @Column(name = "title")
    private String title;

    @Column(name = "date_of_creation")
    private LocalDateTime dateOfCreation;

    @Max(value = 5, message = "No puede ser mayor a 5")
    @Min(value = 1, message = "No puede ser menor a 1")
    @Column(name = "calification")
    private Short calification;

    @OneToMany(mappedBy = "movieSerie")
    private List<Character> characters;

    @ManyToOne
    @JoinColumn(name = "idCategory", updatable = false,insertable = false)
    private Category category;


}
