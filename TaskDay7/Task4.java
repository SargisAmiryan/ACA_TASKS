package com.company.TaskDay7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0 ;
        for (int i = x; i >0 ; i=i/10) {
            if (i%10==d){count++;}
        }
        System.out.println(count);
    }
}
