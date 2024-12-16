package org.mehdi.car_graphql_harmouchi_mehdi.service;

import org.mehdi.car_graphql_harmouchi_mehdi.dto.CarDTO;

import java.util.List;

public interface CarService {
    public CarDTO saveCar(CarDTO carDTO);

    public boolean deleteCar(Long id);

    public List<CarDTO> getCarByModel(String model);


    public List<CarDTO> saveCars(List<CarDTO> carDTOS);
}
