package it.practice.oop.inheritance.hybridinheritance;

public class Robotanimal extends Animal implements Bird,Cat {


    @Override
    public void fly() {
        System.out.println("fly on the sky");
    }

    @Override
    public void run() {
        System.out.println("i am not gonna run over you");
    }

    public void walk(){

        System.out.println("walk on the way");


    }



}
