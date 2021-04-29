package com.company.TaskDay2;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input X");
        int x = scanner.nextInt();
        System.out.println("please input y");
        int y = scanner.nextInt();
        System.out.println("please input z");
        int z = scanner.nextInt();
        double sum = x + y + z;
        int difference = x - y - z;
        double average = (sum) / 3;
        System.out.println("Sum = " + sum);
        System.out.println("Sum = " + difference);
        System.out.println("Sum = " + average);

    }
}
