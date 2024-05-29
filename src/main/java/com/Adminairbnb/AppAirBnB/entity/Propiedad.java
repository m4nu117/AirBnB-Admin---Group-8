package com.Adminairbnb.AppAirBnB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Propiedad {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) //id creados
    private Integer id;

    @NonNull
    private String nombrePropiedad;

    @NonNull
    private String ubicacion;

    @NonNull
    private int numHabitaciones;

    @NonNull
    private int numBanos;

    @NonNull
    private int valorCom;
    }
