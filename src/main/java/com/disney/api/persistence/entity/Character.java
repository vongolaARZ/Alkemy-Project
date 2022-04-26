package com.disney.api.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "characters ")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCharacter;

    @Column(name = "image")
    private String image;

    @Column(name = "name    ")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "weight")
    private String weight;

    @Column(name = "history" )
    private String history;

    @ManyToOne
    @JoinColumn(name ="idMovieSerie", insertable = false,updatable = false )
    private MovieSerie movieSerie;









}
