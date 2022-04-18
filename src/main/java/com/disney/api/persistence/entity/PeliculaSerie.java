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
@Table(name = "pelicula_serie")
public class PeliculaSerie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPeliculaSerie;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha_de_creacion")
    private Date fechaDeCreacion;

    @Size(max = 5,min = 1,message = "error el valor debe encontrarse entre 1 y 5")
    @Column(name = "calificacion")
    private Short calificacion;

    @OneToMany(mappedBy = "peliculaSerie")
    private List<Personaje> personaje;

    @ManyToOne
    @JoinColumn(name = "idGenero", updatable = false,insertable = false)
    private Genero genero;


}
