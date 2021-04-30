package com.company.TaskDay4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a<= b <= c enter numbers ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //a<= b <= c
        int sum = a+c;
        a =sum -a;
        c= sum -c;
        System.out.println("" +a +b +c );


    }
}
