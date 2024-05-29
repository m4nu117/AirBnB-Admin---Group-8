package com.Adminairbnb.AppAirBnB.controller;
import com.Adminairbnb.AppAirBnB.dto.PropiedadDTO;
import com.Adminairbnb.AppAirBnB.entity.Propiedad;
import com.Adminairbnb.AppAirBnB.service.PropiedadService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/api/RegisterProperty")
public class PropiedadController {

    private final PropiedadService propiedadService;

    @GetMapping

    public Iterable <Propiedad> list(){
        return propiedadService.findAll();
    }


    @GetMapping("{id}")
    public Propiedad get(@PathVariable Integer id) {
        return propiedadService.findById(id);

    }


    @ResponseStatus (HttpStatus.CREATED)
    @PostMapping
    public Propiedad create(@Validated @RequestBody PropiedadDTO PropiedadDTO) {
        return propiedadService.create(PropiedadDTO);
    }


    @PutMapping ("{id}")
    public Propiedad update(@PathVariable Integer id,
                            @Validated @RequestBody PropiedadDTO PropiedadDTO) {

        return propiedadService.update(id, PropiedadDTO);

    }



    @ResponseStatus (HttpStatus.NO_CONTENT)
    @DeleteMapping ("{id}")
    public void delete(@PathVariable Integer id) {
        propiedadService.delete(id);


    }
}
