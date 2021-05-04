package com.company.TaskDay6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        while (inputNum > 0) {
            if (inputNum % 2 == 0) {
                System.out.println(inputNum);
            }
            inputNum--;
        }
    }
}
