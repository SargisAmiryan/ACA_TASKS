package com.company.TaskDay7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i%2==0){
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
