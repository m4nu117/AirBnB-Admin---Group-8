package com.Adminairbnb.AppAirBnB.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class PropiedadDTO {
    @NotBlank(message = "El Nombre de la propiedad es obligatorio")
    private String nombrePropiedad;

    @NotBlank(message = "La ubicacion de la propiedad es obligatorio")
    private String ubicacion;

    @NotBlank(message = "El numero de habitaciones de la propiedad es obligatorio")
    private int numHabitaciones;

    @NotBlank(message = "El numero de baños de la propiedad es obligatorio")
    private int numBanos;

    @NotBlank(message = "El valor comercial de la propiedad es obligatorio en COP")
    private int valorCom;

}
