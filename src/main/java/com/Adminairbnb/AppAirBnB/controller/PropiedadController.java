package com.Adminairbnb.AppAirBnB.controller;

import com.Adminairbnb.AppAirBnB.entity.Propiedad;
import com.Adminairbnb.AppAirBnB.repository.PropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/RegisterProperty")
public class PropiedadController {

    @Autowired
    private PropiedadRepository private_PropiedadRepository;


    @GetMapping

    public Iterable <Propiedad> list(){
        return private_PropiedadRepository.findAll();
    }
    @GetMapping("{id}")
    public Propiedad get(@PathVariable Integer id) {
        return private_PropiedadRepository
                .findById(id)
                .orElse(null);



    }
    @PostMapping
    public Propiedad create(@RequestBody Propiedad propiedad) {
        return private_PropiedadRepository.save(propiedad);

    }
    @PutMapping ("{id}")
    public Propiedad update(@PathVariable Integer id,
                            @RequestBody Propiedad form) {
        Propiedad propiedadFromDb = private_PropiedadRepository
                .findById(id)
                .orElse(null);
        propiedadFromDb.setNombrePropiedad(form.getNombrePropiedad());
        propiedadFromDb.setUbicacion(form.getUbicacion());
        propiedadFromDb.setNumBaños(form.getNumBaños());
        propiedadFromDb.setNumHabitaciones(form.getNumHabitaciones());


        return private_PropiedadRepository.save(propiedadFromDb);

    }
}
