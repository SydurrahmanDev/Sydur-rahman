package it.practice.Exception;

public class ExceptionFinally {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 3;
            double c = a / b;
            System.out.println(c);
        } catch (NullPointerException e) { // if catch is not working we could use finally
            System.out.println(e);
        } finally {
            System.out.println("let,s gooo");


            int A1 = 20;
            int B1 = 2;
            int c3 = A1 / B1;
            System.out.println(c3);
        }

    }


}