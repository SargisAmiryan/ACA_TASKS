package com.company.TaskDay4;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int inputNum = scanner.nextInt();


        if (inputNum < 0
        ) {
            System.out.println("number is negative");
            int a = Math.abs(inputNum);
            if (a < 1) {
                System.out.println("small");
            } else if (
                    a > 1000000
            ) {
                System.out.println("large");
            }

        } else if (inputNum > 0
        ) {
            System.out.println("number is positive");
            if (inputNum>1000000){
                System.out.println("large");
            }

        } else {
            System.out.println("number = 0");
        }
    }
}
