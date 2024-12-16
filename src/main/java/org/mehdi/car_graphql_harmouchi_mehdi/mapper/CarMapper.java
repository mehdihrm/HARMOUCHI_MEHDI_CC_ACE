package org.mehdi.car_graphql_harmouchi_mehdi.mapper;


import org.mehdi.car_graphql_harmouchi_mehdi.dao.entities.Car;
import org.mehdi.car_graphql_harmouchi_mehdi.dto.CarDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CarMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDTO carDTO){
        return mapper.map(carDTO, Car.class);
    }

    public CarDTO fromCarToCarDto(Car car){
        return mapper.map(car, CarDTO.class);
    }
}
