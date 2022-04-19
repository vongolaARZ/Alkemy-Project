package com.disney.api.persistence.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Size;
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
    private Date dateOfCreation;

    @Size(max = 5,min = 1,message = "error el valor debe encontrarse entre 1 y 5")
    @Column(name = "calification")
    private Short calification;

    @OneToMany(mappedBy = "movieSerie")
    private List<Character> characters;

    @ManyToOne
    @JoinColumn(name = "idCategory", updatable = false,insertable = false)
    private Category category;


}
