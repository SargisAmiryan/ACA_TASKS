package com.company.TaskDay7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("range from a");
        int a = scanner.nextInt();
        System.out.println("range to a");

        int b = scanner.nextInt();
        System.out.println("remainder ");

        int c = scanner.nextInt();
        System.out.println("divide ");
        int d = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }
}
