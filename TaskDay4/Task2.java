package com.company.TaskDay4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int inputNum = scanner.nextInt();
        if (inputNum % 2 == 0) {
            System.out.println("the number is even number");
        } else if (inputNum == 0) {
            System.out.println("0");
        } else {
            System.out.println("the number is odd");
        }
    }
}
