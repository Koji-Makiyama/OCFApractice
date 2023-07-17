package com.koji.java;

public class Grader {

    /*
    Implement a four way weighted grade.
     */

    private double group1;
    private double group2;
    private double group3;
    private double group4;
    private double overall;

    public static void main(String[] args) {
        // one way weighting
        double tp1 = 4d/5d*100;
//        System.out.println(
//                tp1 + "%"
//        );

        // two way weighting
        double tp2 = (4d/5d)*100; // 80%  .. 50% ... 40%
        double tp22 = (2d/5d)*100; // 40%  .. 50% ... 20%
//        System.out.println(
//                ((tp2*.50) + (tp22*.5)) + "%"
//        );

        // four-way weighting current values
        double tp4 = ((113.5d/160d)*100)*.25;
        double tp44 = ((665d/800d)*100)*.25;
        double tp444 = ((162d/200d)*100)*.25;
        double tp4444 = ((200d/500d)*100)*.25;
        System.out.println(
                "Current overall grade: " + (tp4 + tp44 + tp444 + tp4444) + "%"
        );

        // four-way weighting hypothetical values
        double _tp4 = ((153.5d/200d)*100)*.25;
        double _tp44 = ((865d/1000d)*100)*.25;
        double _tp444 = ((362d/400d)*100)*.25;
        double _tp4444 = ((200d/500d)*100)*.25;
        System.out.println(
                "Hypothetical overall grade: " + (_tp4 + _tp44 + _tp444 + _tp4444) + "%"
        );
    }
}
