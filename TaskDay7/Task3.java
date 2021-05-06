package com.company.TaskDay7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a than b a<b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            for (int j = a; j <b ; j++) {
                if (j*j==i){
                    System.out.println(i);
                }
            }
        }
    }
}
