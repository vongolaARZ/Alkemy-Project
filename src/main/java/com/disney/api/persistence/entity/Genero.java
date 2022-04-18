package com.disney.api.persistence.entity;




import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "genero")
public class Genero {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "imagen")
    private String imagen;

    @OneToMany(mappedBy = "genero")
    private List<PeliculaSerie> peliculasSeries;



}
