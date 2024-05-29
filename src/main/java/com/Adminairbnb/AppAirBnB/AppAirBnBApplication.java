package com.Adminairbnb.AppAirBnB;
import com.Adminairbnb.AppAirBnB.entity.Propiedad;
import com.Adminairbnb.AppAirBnB.repository.PropiedadRepository;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Arrays;
import java.util.List;



@SpringBootApplication
public class AppAirBnBApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAirBnBApplication.class, args);
	}
	@Bean
	CommandLineRunner runner (PropiedadRepository propiedadRepository){
		return args-> {
			List<Propiedad> propiedades = Arrays.asList(
					new Propiedad("Casa Grande Melgar", "Melgar, Cundinamarca", 3,4, 1200000),
					new Propiedad("Finca Para Vacaciones", "Calera, Cundinamarca", 5, 3, 1600000),
					new Propiedad("Casa Con piscina", "Melgar, Cundinamarca", 2, 1, 900000),
					new Propiedad("Condominio Vacacional", "La Vega, Tolima", 8, 4, 1500000),
					new Propiedad("Apartamento RoofTop", "Bogota, Cundinamarca", 4, 2, 1900000)

			);
			propiedadRepository.saveAll(propiedades);

		};


	}
@Bean
	ModelMapper modelMapper(){
		return new ModelMapper();
}
}
