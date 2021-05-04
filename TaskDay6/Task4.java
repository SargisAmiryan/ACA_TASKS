package com.company.TaskDay6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int i =2;
        while (inputNum%i!=0){
            i++;
        }
        System.out.println(i);


    }
}
