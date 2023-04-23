package it.practice.oop.inheritance.multipleinheritance;

public class SoyabinOil implements CanolOil,OlivOil {


    @Override
    public void vegetableoil() {
        System.out.println("keep out from disease");
    }

    @Override
    public void healthyoil() {
        System.out.println("keep fresh our heart");
    }

    public  void  organicOil(){

        System.out.println( "make our health healthy");


    }



}
