package com.company.TaskDay5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        int a = 10;
        int b = 5;
        switch (operation) {
            case "+": {
                System.out.println("10+5 = " + a + b);
            }
            case "-": {
                System.out.println("10-5 = " + (a - b));
            }
            case "/": {
                System.out.println("10/5 = " + (a / b));
            }
            case "*": {
                System.out.println("10*5 = " + (a * 5));
            } default:{
                System.out.println("error");
            }

        }
    }
}
