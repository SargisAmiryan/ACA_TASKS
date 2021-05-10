package com.company.TaskDay11;

public class Task1 {
    public static int min (int a ,int b ,int c, int d){
        int min =a;
        if (b<a&&b<c&&b<d){
            min=b;
        }else
        if (c<a&&c<b&&c<d){
            min=c;
        }else if (d<a&&d<b&&d<c){
            min=d;
        }
        return min;
    }

    public static void main(String[] args) {
        int a =3;
        int b =5;
        int c = 1;
        int d =-2;
        System.out.println( min(a,b,c,d)
        );
    }
}

