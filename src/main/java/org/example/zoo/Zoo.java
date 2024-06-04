package org.example.zoo;

import java.util.List;

public record Zoo(List<Animal> animals) {

    int totalFoodReqGrPerDay() {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.species().foodReqGrPerDay();
        }
        return sum;
    }
}
