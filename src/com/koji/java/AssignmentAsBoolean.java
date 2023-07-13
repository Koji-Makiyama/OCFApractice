package com.koji.java;

public class AssignmentAsBoolean {
    public static void main(String[] args) throws Exception {
        boolean x;
        boolean y;

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

        // DEFAULT can be in the middle of cases
        // cases can be out of order
        switch(3){
            case 5:  System.out.println("5");;
            case 3: System.out.println("3");
            default: System.out.println("DEFAULT");
            case 4: System.out.println("4"); ;

        }

        int i = 0;
        // Assignment block can be empty
        // i++ and ++i will result in the same amount of iterations
        // and i will be the same value because it happens after the loop
        // has finished
        for (; i < 3; i++) {
            System.out.println(i);
            System.out.println("Looping");
        }

        // try-catch can run without a try-catch if it's try-finally
        try {
            System.out.println("TRY WITHOUT CATCH");
            //throw new Exception();
        } finally {
            System.out.println("FINALLY");
        }

    }
}
