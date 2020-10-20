package com.wozu.stfa.three.tuesday.patterns;

public class CarFactory {

    public Car makeCar(String color, String make, String model){
        return new Car(4, color, make, model);
    }

}
