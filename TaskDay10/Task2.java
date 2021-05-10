package com.company.TaskDay10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n>=1440){
            n=n-1440;
        }
        int hour = n/60;
        int minute =n%60;
        System.out.println("hour" +hour+"minute"+minute);

    }
}
