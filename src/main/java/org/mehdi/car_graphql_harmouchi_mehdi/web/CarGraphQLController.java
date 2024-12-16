package org.mehdi.car_graphql_harmouchi_mehdi.web;


import lombok.AllArgsConstructor;
import org.mehdi.car_graphql_harmouchi_mehdi.dto.CarDTO;
import org.mehdi.car_graphql_harmouchi_mehdi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {
    @Autowired
    private CarService carService;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car){
        return carService.saveCar(car);
    }

    @MutationMapping
    public Boolean deleteCar(@Argument Long id){
        return carService.deleteCar(id);
    }


    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }
}
