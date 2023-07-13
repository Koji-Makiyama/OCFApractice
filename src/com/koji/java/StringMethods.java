package com.koji.java;

public class StringMethods {

    public static void main(String[] args) {

        // concates arg to string and returns that new string value
        System.out.println ("A".concat("B"));

        // prints "AB" index 2 is "C" but is exclusive
        System.out.println("ABC".substring(0,2));

        // String interning
        String a = "blah";
        String b = "blah";  // a and b reference the same String object via interning
        String c = new String("blah"); // constructors do not use interning

        boolean isTrue = a == b;
        boolean isNotTrue = a == c;

        System.out.println(isTrue);
        System.out.println(isNotTrue);

    }
}
