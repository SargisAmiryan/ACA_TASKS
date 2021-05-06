package com.company.TaskDay7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        for (int i = 1; i <=inputNum ; i++) {
            if (inputNum%i==0){
                System.out.println(i);
            }
        }
    }
}
