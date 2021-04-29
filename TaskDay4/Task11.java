package com.company.TaskDay4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a > 10 and b is not equal to 10");
        boolean one = (a > 10 && b != 10);
        if (one) {

            System.out.println("Both a and b legal  step1");
        } else {
            System.out.println("no legal  step 1");
        }
        System.out.println("both a and b is positive");
        boolean two = (a > 0 && b > 0);
        if (two) {

            System.out.println("Both a and b legal step2");
        } else {
            System.out.println("no legal step2");
        }
        System.out.println("both a and b is negative ");
        boolean three = (a < 0 && b < 0);
        if (three) {

            System.out.println("Both a and b legal step3");
        } else {
            System.out.println("no legal step 3 ");
        }
        System.out.println("a > 10 b < 1 both of them are odd");
        boolean four = (a > 10 && b < 1 && a % 2 != 0 && b % 2 != 0);
        if (four) {

            System.out.println("Both a and b legal step4");
        } else {
            System.out.println("no legal step 4 ");
        }
        System.out.println("a is a multiple of 5 AND b is a multiple of 5");
        boolean five = (a % 5 == 0 && b % 5 == 0);
        if (five) {

            System.out.println("Both a and b legal step5");
        } else {
            System.out.println("no legal step 5 ");
        }
        System.out.println("a is not a multiple of 5 but b is a multiple of 5");
        boolean six = (a % 5 != 0 && b % 5 == 0);
        if (six) {

            System.out.println("Both a and b legal step6");
        } else {
            System.out.println("no legal step 6 ");
        }


    }
}
