package com.company.creatures;

import com.company.Saleable;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    protected Phone phone;
    public Animal pet;
    private Car car;
    private Double salary;

    public final static Double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public void setCar(Car car) {
        if(car.value > (48 * this.salary))
        {
            System.out.println("Samochód jest za drogi nie stać Cię!");
        }
        else if(car.value <= (48 * this.salary))
        {
            System.out.println("Możesz wziąć samochód w leasing");
            this.car = car;
        }
        else
        {
            System.out.println("Samochód należy do Ciebie");
            this.car = car;
        }

    }


    public Car getCar() {
        return car;
    }
    public String toString()
    {
        return this.firstName + " " + this.lastName;
    }
}
