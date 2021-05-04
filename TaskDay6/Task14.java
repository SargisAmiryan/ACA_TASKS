package com.company.TaskDay6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yor rate");
        int rate = scanner.nextInt();
        System.out.println("percent");
        int percent = scanner.nextInt();
        System.out.println("days");
        int days = scanner.nextInt();
        while (days > 0) {
            days--;
            rate = rate + rate * percent / 100;

        }
        System.out.println(rate);
    }
}
