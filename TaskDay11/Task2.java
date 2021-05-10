package com.company.TaskDay11;

public class Task2 {
    public static double power (double a,int n ){
        double b = a;
        for (int i = 1; i <n ; i++) {
            a=a*b;
        }
        if (n==0){
            a =1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a =3 ;
        int b =3 ;
        System.out.println(power(a,b));    }
}
