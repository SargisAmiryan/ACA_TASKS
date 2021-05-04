package com.company.TaskDay6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int i = 0;
        int j = 1;
        int count = 1;
        while (inputNum >= i) {
            i = i + j;
            count++;
            if (i == inputNum) {
                System.out.println(count);
                break;
            }
            count++;
            j = j + i;
            if (j == inputNum) {
                System.out.println(count);
                break;
            }
            if (inputNum < i) {
                System.out.println("-1");
            }
        }

    }
}
