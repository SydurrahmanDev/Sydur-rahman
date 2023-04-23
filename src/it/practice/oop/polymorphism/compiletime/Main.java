package it.practice.oop.polymorphism.compiletime;

public class Main {


    public static void main(String[] args) {


        Car obj = new Car();
        obj.drive( "toyota");
        obj.drive("marcendes", "rur5");
        obj.drive("bmw", "7series", 1990);

    }

}