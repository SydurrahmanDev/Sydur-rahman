package it.practice;

public class switchtopics {
    public static void main(String[] args) {


        int a = 12;

        switch (a) {
            case 1:
                System.out.println("super");
                break;
            case 6:
                System.out.println("awsome");
                break;
            case 7:
                System.out.println("not bad");
                break;
            default:
                System.out.println("fail");


        }


        String name = "syed";
        switch (name) {

            case "syed":
                System.out.println("right way to go");
                break;
            case "mostak":
                System.out.println("wrong way to go");
                break; //we should use break otherwise result will consider by next line too
            default:
                System.out.println("non way to go");

        }


    }


}
