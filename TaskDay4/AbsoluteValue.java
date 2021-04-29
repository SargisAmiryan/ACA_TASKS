package com.company.TaskDay4;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if (inputNum < 0) {
            inputNum = -inputNum;
            System.out.println(inputNum);
        } else {
            System.out.println(inputNum);
        }
    }
}
