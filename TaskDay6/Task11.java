package com.company.TaskDay6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int i = 0;
        while (inputNum > i) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
