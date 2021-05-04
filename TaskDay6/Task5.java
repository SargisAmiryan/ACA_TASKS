package com.company.TaskDay6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int i = 1;

        while (i <= inputNum) {
            if (i * 2 > inputNum) {
                break;
            }
            System.out.println(i * 2);

            i = i * 2;

        }
    }
}
