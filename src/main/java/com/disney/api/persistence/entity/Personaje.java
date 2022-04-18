package com.disney.api.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
@Table(name = "personajes ")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersonaje;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "peso")
    private String peso;

    @Column(name = "historia" )
    private String historia;

    @ManyToOne
    @JoinColumn(name ="idPeliculaSerie", insertable = false,updatable = false )
    private PeliculaSerie peliculaSerie;









}
