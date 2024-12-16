package org.mehdi.car_graphql_harmouchi_mehdi.service;


import org.mehdi.car_graphql_harmouchi_mehdi.dao.entities.Car;
import org.mehdi.car_graphql_harmouchi_mehdi.dao.repositories.CarRepository;
import org.mehdi.car_graphql_harmouchi_mehdi.dto.CarDTO;
import org.mehdi.car_graphql_harmouchi_mehdi.mapper.CarMapper;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;
@Service

public class CarManager implements CarService {
    private CarRepository carRepository;
    private CarMapper carMapper;
    public CarManager(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }


    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        return carMapper.fromCarToCarDto(this.carRepository.save(carMapper.fromCarDtoToCar(carDTO)));
    }

    @Override
    public boolean deleteCar(Long id) {
        try {
            carRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOS;
    }

    @Override
    public List<CarDTO> saveCars(List<CarDTO> carDTOS) {
        List<Car> cars = new ArrayList<>();
        for (CarDTO avionDto : carDTOS) {
            cars.add(carMapper.fromCarDtoToCar(avionDto));
        }

        cars = carRepository.saveAll(cars);

        carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOS;
    }
}

