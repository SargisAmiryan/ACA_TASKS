package com.company.TaskDay4;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;
        if (max<=num2){
            max=num2;
        }else if (max<=num3){
            max=num3;
        }
        System.out.println(max);

    }
}
