package com.koji.java;

import java.util.ArrayList;
import java.util.List;

public class ArraySubListAndKeywords {

    public static void main(String[] args){

        // Size 0 can still subList(0,0) returning an empty set []
        // subList() params higher, e.g. 1,1 or more throws an indexoutofbounds though
        List myList = new ArrayList( new ArrayList().subList(0, 0));
        System.out.println(myList);
        System.out.println(myList.size());

        /*
        Keywords
        abstract .. boolean .. byte .. char .. catch default .. throws .. transient
        synchronized .. void .. native .. enum .. strictfp

        null, true, false are literals, like 0, 1

         */
    }
}
