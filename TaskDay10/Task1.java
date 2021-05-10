package com.company.TaskDay10;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x =1;
        for (int i = 0; i <n ; i++) {
            x=x*2;
        }
        System.out.println(x);
    }
}