package com.koji.java;

public class SwitchGotchasAndUnicode {

    public static void main(String[] args) {

        // DEFAULT can be in the middle of cases
        // cases can be out of order
        switch (3) {
            case 5:
                System.out.println("5");
                ;
            case 3:
                System.out.println("3");
            default:
                System.out.println("DEFAULT");
            case 4:
                System.out.println("4");
                ;
        }

        switch ((byte) -128) {
            case -128:
                System.out.println("Lower limit");
            case 127:
                System.out.println("Upper limit");
            case 'a':
                System.out.println("ASCII 97");
            case 'z':
                System.out.println("ASCII 122");
        }
    }
}
