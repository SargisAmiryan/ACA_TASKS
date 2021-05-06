package com.company.TaskDay7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 numbers");
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for (int i = 0; i < 5; i++) {
            int inputNum = scanner.nextInt();
            if (inputNum > 0) {
                positive++;
            }
            if (inputNum < 0) {
                negative++;
            }
            if (inputNum == 0) {
                zero++;
            }

        }
        System.out.println("positive " +positive +"\n negative " +negative +"\n zero "+zero);
    }
}
