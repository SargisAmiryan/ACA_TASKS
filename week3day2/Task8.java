package com.company.week3day2;

public class Task8 {
    public static double distance(int x, int y){
        double distance = Math.sqrt(x*x+y*y);
        return distance;
    }
    public static double distance(int x1, int x2,int x3,int x4 ){
        double distance = Math.sqrt((x1-x2)*(x1-x2)+(x3-x4)*(x3-x4));
        return distance;
    }
}
