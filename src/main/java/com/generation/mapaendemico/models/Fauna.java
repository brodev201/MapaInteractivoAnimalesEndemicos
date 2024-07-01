package com.generation.mapaendemico.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fauna")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Fauna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ncientifico", nullable = false, length = 512)
    private String nombreCientifico;

    @Column(name = "nombrecomun", nullable = false, length = 512)
    private String nombreComun;
    
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;

    @Lob
    @Column(name = "imghuella")
    private byte[] imghuella;
    
    @Column(name = "clase", nullable = false, length = 512)
    private String clase;

    @Column(name = "orden", nullable = false, length = 512)
    private String orden;

    @Column(name = "familia", nullable = false, length = 512)
    private String familia;

    @Column(name = "regiones", nullable = false, length = 512)
    private String regiones;

    @Column(name = "amenaza", nullable = false, length = 512)
    private String amenaza;

    @Column(name = "vertebrado_invertebrado", nullable = false, length = 512)
    private String vertebradoInvertebrado;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "peso")
    private long peso;

    @Column(name = "altura")
    private long altura;

    @ManyToOne
    @JoinColumn(name = "parques_id")
    private Parques parquesId;
}
