package com.company.TaskDay6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int i = 0;
        while (inputNum > 0) {
            System.out.println(inputNum);
            inputNum--;
        }
    }
}
