package com.company.TaskDay11;

public class Fibonacci6 {
    public static int fib(int n){
        int a = -1;
        int b =1;
        int nFib=0;
        int count =n;

        while (count>0){
            a=a+b;
            count--;

            if (count==0){
                nFib=a;
                break;
            }count--;
            b=b+a;
            if (count==0){
                nFib=b;
                break;
            }

        }
        return nFib;
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
