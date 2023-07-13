package com.koji.java;

import java.util.ArrayList;
import java.util.List;

public class AssignmentAsBoolean {

    public static void main(String[] args) throws Exception {

        boolean x;
        boolean y;
        String myStr;

        // returns TRUE and prints (assignment returns the assigned value)
        if(x = true) {

            // prints false (assignment is acceptable in println)
            System.out.println(x = false);


            System.out.println("Line 7 printed");
        }

        // returns FALSE and prints
        if(y = false) {
            System.out.println("Line 11 printed");
        }

        // Requires type boolean, and Strings are not default true in Java
//        if(myStr = "FISH") {
//            System.out.println("FISH");
//        }

        // If you try to declare a NEW primitive, you cannot use assignment
//        if(boolean newBool = true) {
//            System.out.println("DOESN'T WORK");
//        }

    }
}
