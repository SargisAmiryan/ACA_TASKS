package com.company.TaskDay2;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int a;
        int b;
        int c;
        a = inputNumber % 10;
        b = inputNumber / 10 % 10;
        c = inputNumber / 100;
        int sum = a + b + c;
        System.out.println(sum);
    }
}
