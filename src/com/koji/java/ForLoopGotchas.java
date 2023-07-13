package com.koji.java;

public class ForLoopGotchas {

    public static void main(String[] args) {

        int i = 0;
        // Assignment block can be empty
        // i++ and ++i will result in the same amount of iterations
        // and i will be the same value because it happens after the loop
        // has finished
        for (; i < 3; i++) {
            System.out.println(i);
            System.out.println("Looping");
        }

        //for (; boolean abc = true; ) {

        //}
    }
}
