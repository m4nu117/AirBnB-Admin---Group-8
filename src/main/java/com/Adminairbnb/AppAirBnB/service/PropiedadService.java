package com.Adminairbnb.AppAirBnB.service;

import com.Adminairbnb.AppAirBnB.dto.PropiedadDTO;
import com.Adminairbnb.AppAirBnB.entity.Propiedad;
import com.Adminairbnb.AppAirBnB.exception.ResourceNotFoundException;
import com.Adminairbnb.AppAirBnB.repository.PropiedadRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;

@AllArgsConstructor
@Service


public class PropiedadService {

    private final PropiedadRepository propiedadRepository;
    private final ModelMapper mapper;


    public Iterable <Propiedad> findAll(){
        return propiedadRepository.findAll();
    }

    public Propiedad findById(Integer id) {
        return propiedadRepository
                .findById(id)
                .orElseThrow(ResourceNotFoundException::new );
    }

    public Propiedad create(PropiedadDTO PropiedadDTO) {
        Propiedad propiedad = mapper.map(PropiedadDTO, Propiedad.class);

        return propiedadRepository.save(propiedad);

    }

    public Propiedad update(Integer id, PropiedadDTO PropiedadDTO) {
        Propiedad propiedadFromDb = findById(id);

        mapper.map(PropiedadDTO, propiedadFromDb);



        return propiedadRepository.save(propiedadFromDb);

    }
    public void delete(Integer id) {
        Propiedad propiedadFromDb = findById(id);
        propiedadRepository.delete(propiedadFromDb);


    }
}
