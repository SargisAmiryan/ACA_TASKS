package com.company.TaskDay6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int count = 1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        while (inputNum != 0) {
            if (inputNum > max) {
                secondMax = max;
                max = inputNum;
            } else if (inputNum < max && inputNum > secondMax) {
                secondMax = inputNum;
            }

            count++;
            inputNum = scanner.nextInt();

        }
        System.out.println(secondMax);


    }
}
