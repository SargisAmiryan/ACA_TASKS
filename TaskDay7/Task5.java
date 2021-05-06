package com.company.TaskDay7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a than b a<b");
        int a = scanner.nextInt();
        int count = 0;
        for (int i = a; i > 0; i /= 10) {
            if (i % 10 == 0 && count == 0) {
                continue;
            }
            count++;
            System.out.print(i % 10);
        }
    }
}
