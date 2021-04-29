package com.company.TaskDay4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int inputNum = scanner.nextInt();
        if (inputNum < 18) {
            System.out.println("you are teenager ");
        } else if (inputNum < 1) {
            System.out.println("try again");
        } else {
            System.out.println("A person who is eligible");
        }
    }
}
