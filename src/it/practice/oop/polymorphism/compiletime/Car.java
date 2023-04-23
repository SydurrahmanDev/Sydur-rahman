package it.practice.oop.polymorphism.compiletime;

public class Car {

public void drive(String name){
    System.out.println( "i drive " + name + " car" );

}

    public void drive(String name, String band ){

    System.out.println("i drive "+name +" car" +band);
    }



    public void drive(String name,String band, int year  ){

        System.out.println("i drive "+name+" band "+"\n and " +year);


    }






}
