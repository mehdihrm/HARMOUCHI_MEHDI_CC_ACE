package org.mehdi.car_graphql_harmouchi_mehdi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class CarDTO {
    public CarDTO(){

    }
    public CarDTO(String model, String color, String matricul, int price) {
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }

    private String model;
    private String color;
    private String matricul;
    private int price;
}
