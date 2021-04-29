package com.company.TaskDay2;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("right triangle");
        System.out.println("please input X");
        int x = scanner.nextInt();
        System.out.println("please input y");
        int y = scanner.nextInt();
        // right triangle

        System.out.println("square = " + x * y / 2);
    }
}
