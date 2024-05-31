package com.Adminairbnb.AppAirBnB.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Propiedad")
@Table(name="PROPIEDADES")
public class Propiedad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "propiedad_seq")
    @SequenceGenerator(name = "propiedad_seq", sequenceName = "propiedad_sequence", allocationSize = 1)
    @Column(name= "ID_PROPIEDAD", nullable = false, unique = true)
    private Integer id;

    @Column(name = "NOMBRE_PROPIEDAD", nullable = false)
    private String nombrePropiedad;

    @Column(name = "UBICACION", nullable = false)
    private String ubicacion;

    @Column(name = "NUM_HABITACIONES", nullable = false)
    private int numHabitaciones;

    @Column(name = "NUM_BANOS", nullable = false)
    private int numBanos;

    @Column(name = "VALOR_COM", nullable = false)
    private int valorCom;

    public Propiedad(String nombrePropiedad, String ubicacion, int numHabitaciones, int numBanos, int valorCom) {
        this.nombrePropiedad = nombrePropiedad;
        this.ubicacion = ubicacion;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.valorCom = valorCom;
    }
}

