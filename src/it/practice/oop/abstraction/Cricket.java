package it.practice.oop.abstraction;

import java.util.concurrent.Callable;

public class Cricket extends Abstraction {
    @Override
    public void neyman() {
        System.out.println("he got 4.88");
    }

    @Override
    public void messi() {
        System.out.println("he got 5");
    }

    @Override
    public void cr7() {
        System.out.println("he got 4.98");
    }


    //  public abstract void hi(); abstract method only we can use abstraction class but we can use void method in abstract

    public static void main(String[] args) {


        Cricket obj = new Cricket();
         obj.cr7();
         obj.neyman();
         obj.messi();
         obj.goat();


            }



        };

















