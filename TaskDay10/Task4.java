package com.company.TaskDay10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean prim = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prim = false;
            }
        }

        System.out.println(prim);


    }
}
