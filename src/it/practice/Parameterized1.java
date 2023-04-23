package it.practice;

public class Parameterized1 {

    String fristname;
    String  lastname;
    int dob;

    public Parameterized1(String f_name, String l_name, int d_dob     ) {

        this.fristname = f_name;
        this.lastname = l_name;
        this.dob = d_dob;
    }

        public void known() {

        int ab= 24;
        int bc =30;
      //  this.fristname; we can call anywhere field veriable but we can,t call local




        }



    public static void main(String[] args) {

        Parameterized1 obj= new Parameterized1("syed","rahman", 1997 );
        Parameterized1 obj2= new Parameterized1("ashiq","rahman",1980);

        System.out.println( obj.fristname);
        System.out.println(obj.lastname);
        System.out.println(obj.dob);

        System.out.println(obj.fristname+" "+obj.lastname+" " + obj.dob   );
        System.out.println(obj2.fristname+ " " +obj2.lastname+" "+obj2.dob);
        System.out.println(  );




    }














}
