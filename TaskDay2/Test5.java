package com.company.TaskDay2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input X");
        int x = scanner.nextInt();
        System.out.println("please input y");
        int y = scanner.nextInt();
        int reminder = x % y;
        System.out.println(reminder);
    }
}
