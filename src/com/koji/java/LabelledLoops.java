package com.koji.java;

public class LabelledLoops {
    public static void main(String[] args) {

        firstLayer:
            for(int i=0; i<=3;i++){
                if(i==1){
                    System.out.println("1 continues");
                    continue firstLayer;
                }
                if(i==3){
                    System.out.println("3 breaking firstLayer");
                    break firstLayer;
                }
                System.out.println(i+" passes through");
            }


        int j = 0;
        runsFiveTimes:
            while(true){
                System.out.print(j+++" ");
                if (j==5) break runsFiveTimes;
            }
        System.out.println();

        int k = 0;
        int x;
        thisDoWhileLoop:
            do {
                x = ++k;
                System.out.println(++x + "F");
                System.out.println(x++ + "M");
                System.out.println(++x + "L");
                if(x > 8) break thisDoWhileLoop;
            } while(x > k);

    }
}
