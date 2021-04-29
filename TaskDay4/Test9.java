package com.company.TaskDay4;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int inputNum = scanner.nextInt();
        if (inputNum%4==0){
            System.out.println("year is a leap year");

        } else {
            System.out.println("year is not a leap year" );
        }
    }
}
