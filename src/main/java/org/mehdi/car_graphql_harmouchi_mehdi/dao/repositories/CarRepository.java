package org.mehdi.car_graphql_harmouchi_mehdi.dao.repositories;

import org.mehdi.car_graphql_harmouchi_mehdi.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {
    List<Car> findByModel(String model);
}
