package com.company.TaskDay7;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        for (int i = 0; i <10 ; i++) {
            int inputNum = scanner.nextInt();
             sum =sum + inputNum;
        }
        System.out.println(sum);
    }
}
