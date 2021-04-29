package com.company.TaskDay4;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a+b>c||b+c>a||c+a>b){
            System.out.println("NOT triangle with such sides ");
        }
        else {
            System.out.println("there is triangle with such sides");
        }
    }
}
