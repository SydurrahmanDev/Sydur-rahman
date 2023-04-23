package it.practice.oop.polymorphism.runtime;

public class Car extends Vehicle {


    @Override
    public void ElectronicCar() { //last one working if i close the one then before one get result
        System.out.println("in oder to governor say that electronic car will be in road on augst");
    }

    public void Mechaic() {
        System.out.println("awsome");
    }



}