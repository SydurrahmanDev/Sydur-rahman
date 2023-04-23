package it.practice.Exception;

public class ExceptionArray {
    public static void main(String[] args) {


        // public void hurry() { if i want use arry within a void method i can // age = variable int= data type public void  = public modefire
        // hurry= method name

        int[] age = new int[5];
        age[0] = 11;
        age[1] = 5;
        age[2] = 10;
        age[3] = 22;
        age[4] = 8;

        try {
            System.out.println(age[5]);
        }catch ( Exception e  ) {
            System.out.println(e);
        }
        int A1 = 20;
        int B1 = 2;
        int c3 = A1 / B1;
        System.out.println(c3);



}

}
