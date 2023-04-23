package it.practice.collection;

import java.util.ArrayList;

public class ArrayLists {


    public static void main(String[] args) {


        int[] sayed = new int[6];
        sayed[0] = 3;
        sayed[1] = 6;
        sayed[2] = 8;
        sayed[3] = 10;
        sayed[4] = 6;

        System.out.println(sayed[4]);


        ArrayList<Integer> Salary = new ArrayList<>();
        Salary.add(20);
        Salary.add(120);
        Salary.add(220);
        Salary.add(320);
        Salary.add(420);
        Salary.add(520);
        Salary.add(620);
        Salary.add(720);

        System.out.println(Salary.get(5));
        System.out.println(Salary.isEmpty());
        System.out.println(Salary.size());


        // ArrayList<Boolean> Salarys = new ArrayList<>();
        //   Salarys.add(true);

        //  ArrayList<Long> Salarys = new ArrayList<>();
        //  Salarys.add(1234567827782l);

        // ArrayList<Double> Salarys = new ArrayList<>();
        //  Salarys.add(123.44);


        ArrayList Salarys = new ArrayList();
        Salarys.add(true);
        Salarys.add(1234556678888l);
        Salarys.add(123.5566);
        Salarys.add(false);
        Salarys.add('%');
        Salarys.add("sydur");
        Salarys.add(123);
        System.out.println(Salarys.size());
        System.out.println(Salarys.get(3));
       // System.out.println(Salarys.remove(3));after all code will be filled so you should use try and catch
        System.out.println(Salarys.get(6));

    }


}
