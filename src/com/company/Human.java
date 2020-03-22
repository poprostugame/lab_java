package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;


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
}
