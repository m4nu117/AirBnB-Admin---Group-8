package com.Adminairbnb.AppAirBnB.service;

import com.Adminairbnb.AppAirBnB.entity.Propiedad;
import com.Adminairbnb.AppAirBnB.repository.PropiedadRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service


public class PropiedadService {

    private final PropiedadRepository propiedadRepository;

    public Iterable <Propiedad> findAll(){
        return propiedadRepository.findAll();
    }

    public Propiedad findById(Integer id) {
        return propiedadRepository
                .findById(id)
                .orElse(null);
    }

    public Propiedad create(Propiedad propiedad) {
        return propiedadRepository.save(propiedad);

    }

    public Propiedad update(Integer id, Propiedad form) {
        Propiedad propiedadFromDb = findById(id);

        propiedadFromDb.setNombrePropiedad(form.getNombrePropiedad());
        propiedadFromDb.setUbicacion(form.getUbicacion());
        propiedadFromDb.setNumBanos(form.getNumBanos());
        propiedadFromDb.setNumHabitaciones(form.getNumHabitaciones());


        return propiedadRepository.save(propiedadFromDb);

    }
    public void delete(Integer id) {
        Propiedad propiedadFromDb = findById(id);
        propiedadRepository.delete(propiedadFromDb);


    }
}
