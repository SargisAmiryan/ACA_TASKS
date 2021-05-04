package com.company.TaskDay6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int sum = 0;
        int a = 0;
        while (inputNum >= 1) {
            a = inputNum % 10;
            sum = sum + a;
            inputNum = (inputNum - a) / 10;

        }
        System.out.println(sum);
    }
}
