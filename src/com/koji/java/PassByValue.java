package com.koji.java;

public class PassByValue {

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass("LINE6"); // myClass1 is created with myStr == "LINE6"
        System.out.println(myClass1 + " was born with a myStr value of: " + myClass1.myStr);
        myFunction(myClass1);                        // myClass1.myStr is assigned a new object with "LINE11"
                                                     // myClass1 is an Object, and in Java Objects are immutable
        System.out.println(myClass1.myStr);
        System.out.println(myClass1 + " has a myStr value of: " + myClass1.myStr);
    }

    /*
     *  You can tell a variable to point to a different object
     *  but you cannot overwrite an object as a different object
     *
     *  The value entering myFunction is myClass1. It enters as MyClass obj1.
     *  obj1 is redirected to point to a newly instantiated object. (it does not CHANGE the properties/object 'myClass1'
     *  The pointer to this object is lost because the method does not return the object.
     */
    static void myFunction(MyClass obj1){
        System.out.println(obj1 + " is what obj1 enters as from the input parameter");
        obj1 = new MyClass("LINE11");   // new Object instantiated and variable now points to the different memory address ...
        System.out.println(obj1 + " has a myStr value of: " + obj1.myStr);
        return;
    }

}

class MyClass {
    String myStr = "ABC";
    MyClass myClass;

    MyClass(String str) {
        this.myStr = str;
    }
}
