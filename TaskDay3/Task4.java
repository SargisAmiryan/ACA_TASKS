package com.company.TaskDay3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius ?");
        double inputRadius = scanner.nextDouble();
        double area = Math.PI * inputRadius * inputRadius;
        System.out.println("area = " + area);
        double perimeter = Math.PI * 2 * inputRadius;
        System.out.println("perimeter " + perimeter);

    }
}
