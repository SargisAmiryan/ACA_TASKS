package com.company.TaskDay6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input firstDayKm");
        int firstDayKm = scanner.nextInt();
        System.out.println("today KM");
        int todayKM = scanner.nextInt();
        int count = 1;
        float k = firstDayKm;
        while (todayKM >= k) {
            k = k + k * 10 / 100;
            count++;

        }
        System.out.println(count);

    }
}
