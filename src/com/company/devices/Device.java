package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable{
    public final String mark;
    public final String model;
    public final Integer yearOfProduction;
    public Double value;

    public Device(String mark, String model, Integer yearOfProduction){
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void turnOn();
}
