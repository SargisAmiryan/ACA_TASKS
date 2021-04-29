package com.company.TaskDay2;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int Digit = inputNumber / 10;
        int secondDigit = Digit % 10;
        System.out.println(secondDigit);

    }
}
