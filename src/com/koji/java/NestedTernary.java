package com.koji.java;

// Goal: Learn a variety of Java syntax options to broaden knowledge.
public class NestedTernary {

    public static void main(String[] args) {

        int i1=3, i2=5, i3=7;

        boolean r1 = (i1>i2)?i1>i2:i1>i2; // TERNARY if-then with 3 args ... returns false

        String r2 = (i2 > i1)?i2<i3?"True True":"True False":"False"; // NESTED TERNARY ... returns "True True"

        String r3 = (true)?(true)?"TrueTrue":"TrueFalse":"False";  // returns "TrueTrue"
        String r4 = (true)?(false)?"TrueTrue":"TrueFalse":"False"; // returns "TrueFalse"
        String r5 = (false)?(true)?"TrueTrue":"TrueFalse":"False"; // returns "False"

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);


    }


}
