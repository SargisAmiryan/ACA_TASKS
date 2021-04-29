package com.company.TaskDay4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int inputNum = scanner.nextInt();
        if (inputNum % 5 == 0) {
            System.out.println("the number is multiple of a 5");
        } else if (inputNum == 0) {
            System.out.println("try again");
        } else {
            System.out.println("the number is not multiple of a 5");
        }
    }
}
