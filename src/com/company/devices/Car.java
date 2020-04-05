package com.company.devices;

import com.company.Saleable;

public class Car extends Device implements Saleable {

    final Double engineCapacity;
    final String colour;


    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        super(mark, model, yearOfProduction);

        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.value = value;
    }
    public String toString(){
        return this.mark + " " + this.yearOfProduction;
    }

    @Override
    void turnOn() {

    }

    @Override
    public void sell() {
        System.out.println("you sell it");
    }
}
