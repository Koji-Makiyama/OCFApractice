package com.koji.java;

public class NestedLoops {

    public static void main(String[] args) {

        int _a=0,_b=1,_c=2,_d=3;
        /*
         *  How many times will "Outer", "Middle", and "Inner" print?
         *  A) 3, 4, 13
         *  B) 3, 4, 15
         *  C) 3, 2, 11
         *  D) 3, 2, 16
         *  E) 3, 3, 15
         */
        for(int i=0;i<_d;i++){
            System.out.print("Outer");
            for(int j=0;j<_d;j++){
                if(j%2!=0)
                System.out.println("Middle");
                for(int k=0;k<_d;k++){
                    if(k%2==0)
                    System.out.println("Inner");
                }
            }
        }


    }
}
