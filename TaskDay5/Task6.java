package com.company.TaskDay5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int maxValue = (num1>num2 && num1>num3) ? num1:(num2>num1 && num2>num3)?num2 : num3;
        System.out.println(maxValue);

    }
}
