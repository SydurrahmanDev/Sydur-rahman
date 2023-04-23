package it.practice;

public class Scopeofvariable {


    //scope of variables 3 types
    // 1. field variable
    //2. Local variable
    //3. parameterized variable

    //field variable(class,global variable)= after class you use database that,s call field variable like=

    // public int abc=20;
    // public String player= "messi"; //player=field variable


    // if use static
    public static String player;
    public static int abc;


    // Local variable & parameterized variable
    public void addsalary() { //(string names)names= parameterized variable
        System.out.println(player="neymar");
        System.out.println(abc=20);
        String player = "messi"; // player= local variable
        System.out.println(player);

    }


    public static void main(String[] args) {

        Scopeofvariable soccer= new Scopeofvariable();
            soccer.addsalary();








    }











}
