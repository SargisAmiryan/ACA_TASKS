package com.company.TaskDay6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum = scanner.nextInt();
        int count = 0;
        double a = inputNum;
        while (inputNum >= 1) {

            if (inputNum == 1 || inputNum == 2) {
                System.out.println(a);
                break;
            }
            inputNum = inputNum / 2;
            if (inputNum < 2) {
                inputNum = scanner.nextInt();
                a = inputNum;
                count++;
            }
        }
        System.out.println(count + 1);

    }

}
