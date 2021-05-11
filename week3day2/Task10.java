package com.company.week3day2;

public class Task10 {
    public static int reminder(int number) {
        int sum = 0 ;
        for (int i = number; i >0 ; i/=10) {
            sum=sum + i%10;
        }
        return sum;
    }
    public static int reminder(int number,int a){
        int sum = 0 ;
        for (int i = number; i >0 ; i/=10) {
            sum=sum + i%10;
        }
        return sum*a/100;
    }

    public static void main(String[] args) {
        System.out.println(reminder(1234,50));
    }
}
