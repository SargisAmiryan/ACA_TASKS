package com.company.TaskDay4;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("''''''MENU''''''\n" +
                "Press 1 for perimeter \n" +
                "Press 2 for perimeter \n");
        int inputNum = scanner.nextInt();
        int radius = 4;
        double perimeter;
        double area;

        if (inputNum == 1) {
            perimeter = Math.PI * 2 * radius;
            System.out.println("perimeter = " + perimeter);
        } else if (inputNum == 2) {
            area = Math.PI * Math.pow(radius, 2);
            System.out.println("area = " + area);
        } else {
            System.out.println("please select 1 or 2");

        }

    }
}
