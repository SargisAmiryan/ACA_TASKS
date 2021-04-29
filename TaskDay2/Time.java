package com.company.TaskDay2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minute = scanner.nextInt();
        float hour = minute / 60f;
        System.out.println(hour);
    }
}
