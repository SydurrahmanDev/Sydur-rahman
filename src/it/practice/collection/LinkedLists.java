package it.practice.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {



        LinkedList<Integer> Salary = new LinkedList<>();
        Salary.add(20);
        Salary.add(120);
        Salary.add(220);
        Salary.add(320);
        Salary.add(420);
        Salary.add(520);
        Salary.add(620);
        Salary.add(720);

        System.out.println(Salary.get(5));
        try {
            System.out.println(Salary.remove(2));

        }catch (Exception e){
        System.out.println(e); }

        System.out.println(Salary.get(6));

        System.out.println(Salary.isEmpty());
        System.out.println(Salary.size());


        LinkedList Salarys= new LinkedList();
        Salarys.add(true);
        Salarys.add(1234556678888l);
        Salarys.add(123.5566);
        Salarys.add(false);
        Salarys.add('%');
        Salarys.add("sydur");
        Salarys.add(123);
        System.out.println(Salarys.size());
        System.out.println(Salarys.get(3));
        // System.out.println(Salarys.remove(3));after all code will be filled so, you should use (try and catch)
        System.out.println(Salarys.get(6));












    }




}
