package com.company.TaskDay6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int i = 0;
        while (i*i<inputNum){
            System.out.println(i*i);
            i++;
        }
    }
}
