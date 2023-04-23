package it.practice;

public class ArrayTopics{
    public static void main(String[] args) {


        int[] age = new int[5];
        age[0]= 5;
        age[1] = 6;
        age[2]= 10;
        age[3]= 20;
        age[4]= 30;
     //   age[5]= 22;
        System.out.println(age[4]);

        System.out.println(age.length);


        //normal java
         String name = "ashik";
         String name1 = "nahim";
         String name2 = "pulok";


        System.out.println(name2 );






        //traditional way
         String[] items= new String[5];
               items[0]= "nahim";
               items[1]= "ashik";
               items[2]= "robin";
               items[3]="syed";
               items[4]= "nayok";
        System.out.println( "traditional way:"+items[4] );

        //modern way
        String[] item={"nahim","ashik","robin","syed","nayok"};

        System.out.println("modern way:"+item[3]);

        int[] salary={ 10,20,30,5  };
       for (  int solar:salary  ){
            System.out.println(solar);
        }
        //System.out.println( salary[2]);









    }


    }
