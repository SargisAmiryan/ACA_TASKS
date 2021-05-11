package com.company.week3day2;

public class Task6 {
    public static double square(int r) {
        double s = Math.PI * r * r;
        return s;
    }

    public static double square(float r) {
        double s = r*r;
        return s;
    }
    public static double square(float a,float b) {
        double s = a*b;
        return s;
    }

    public static void main(String[] args) {
        int a =4;
        int b = 5;
        float c = 4.4f;
        System.out.println(square(a,b));
    }
}
