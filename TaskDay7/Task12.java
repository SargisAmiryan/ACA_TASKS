package com.company.TaskDay7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= inputNum; i++) {

            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(i + " ");
                if (count == inputNum) {
                    break;
                }
            }
            if (count == inputNum) {
                break;
            }

        }
    }
}

