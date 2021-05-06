package com.company.TaskDay6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum = scanner.nextInt();
        int count = 0;
        int a = 1;
        while (inputNum > a) {
            a = a * 2;
            count++;
        }
        System.out.println(count);
    }
}
