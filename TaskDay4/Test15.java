package com.company.TaskDay4;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a != c) {
            System.out.println("2");
        } else if (a == c && c != b) {
            System.out.println("2");
        } else if (b == c && c != a) {
            System.out.println("2");
        } else if (a == b && a == c) {
            System.out.println("3");
        } else {
            System.out.println("0");
        }
    }
}
