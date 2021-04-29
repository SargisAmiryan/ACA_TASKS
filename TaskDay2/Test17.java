package com.company.TaskDay2;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int firstDigit = inputNumber/100;
        System.out.println(firstDigit);

    }
}
