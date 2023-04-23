package it.practice.Exception;

public class THrowAndThrows {

    public static void main  (String[] args)   throws Exception {


        int a = 2;
        int b = 0;


        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            throw new NegativeArraySizeException("game of thorns"); // individual use for
        }finally {
            System.out.println("java");


            int A1 = 10;
            int B1 = 2;
            int c3 = A1 / B1;
            System.out.println(c3);
        }

    }
}