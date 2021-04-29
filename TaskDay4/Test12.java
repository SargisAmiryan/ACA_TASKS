package com.company.TaskDay4;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean x =(a%7==0||b%7==0&&a>0&&b>0&&a>b);
        System.out.println(x);
    }
}
