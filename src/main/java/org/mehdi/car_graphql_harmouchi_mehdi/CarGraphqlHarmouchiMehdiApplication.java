package org.mehdi.car_graphql_harmouchi_mehdi;

import org.mehdi.car_graphql_harmouchi_mehdi.dto.CarDTO;
import org.mehdi.car_graphql_harmouchi_mehdi.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarGraphqlHarmouchiMehdiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarGraphqlHarmouchiMehdiApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CarService carService){
		return  args -> {
			carService.saveCars(
					List.of(
							new CarDTO("Peugeot 208","420004T4","blue",20000),
							new CarDTO("Peugeot 208","420004T4","blue",20000),
							new CarDTO("Peugeot 208","420004T4","blue",20000),
							new CarDTO("Peugeot 208","420004T4","blue",20000)

					)

			);
		};
	}

}
