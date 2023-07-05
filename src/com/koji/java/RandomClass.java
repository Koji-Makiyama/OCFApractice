package com.koji.java;

import java.io.File;
import java.util.Random;

public class RandomClass {
boolean bool;

public static String Main(){
    System.out.println("HELLO");
    return "RETURNED STRING";
}
    public static void main(String[] args)throws Exception{
        Random r = new Random();
        System.out.println(r.nextInt(10));

        System.out.println(10L);


        int[] ia = new int[1];
        Object oA[]  = new Object[1];
        boolean bool;
        System.out.println(ia[0]);
        System.out.println(oA[0]);
        RandomClass ra = new RandomClass();
        System.out.println(ra.bool);        // will be initialized false
        boolean bool2;
        // System.out.println(bool2); local variables are not initialized
        // If we declare a local variable without an initial value, we'll get an error.
        // This error occurs only for local variables, since Java automatically initializes
        // the instance variables at compile time
        String[] arr = new String[0];
        int[] arr2 = new int[0];

        if (5 == 5.5f) {
            System.out.println("WORKED");
        }
        System.out.println(5.5f + 6.5d);
        System.out.println('a' + 2);

        if (10 == 12 ? true:false){}
        if (bool = false) {}
        int x;

        int i;       int j;
        for (i = 0, j = 0 ; j < 1 ; ++j , i++){
            System.out.println( i + " " + j );
        }
        System.out.println( i + " " + j );


        int ii = 0;
        for (ii=1 ;  ii<5  ; ii++) continue; //1
        //for (ii=0 ;       ; ii++) System.out.println("FOREVER"); //2    the default for an empty condition is TRUE
        //for (    ; ii<5?false:true ;    ) System.out.println("HMM"); //3 always results in true, infinite loop

        // for loop (1 | 2 | 3)
        // you don't need 1 or 3 if you have 2
        // if you don't have 2, it will run forever

        // Although it is bad practice, you can have both main() and Main() methods.
        System.out.println(Main());


        // enhanced for loop is just a for each loop

        // Accessing an element in an array is faster than in an ArrayList
        // It consumes less memory to use an array than an ArrayList
        // neither are thread-safe

        // break without a label, can occur only in a switch, while, do or for statement.

        /*
        javac ClassName.java
        java ClassName

        OR IF USING PACKAGES ...

        javac -d . TestClass.java          // creates compiled files in current directory
        java -classpath . a.a.a.TestClass  // references current directory for compiled files
        java -cp . a.a.a.TestClass

        What is javac -d ../a TestClass.java?
         */

        //'a' '\n' '\uDEAF'

    }

}
