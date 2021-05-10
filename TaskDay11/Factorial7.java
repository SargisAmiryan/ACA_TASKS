package com.company.TaskDay11;

public class Factorial7 {
    public static int factorial(int a){
        int x =a ;
        for (int i = 1; i < x ; i++) {
            a=a*i;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
