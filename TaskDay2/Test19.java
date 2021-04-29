package com.company.TaskDay2;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inputA");
        int inputA = scanner.nextInt();
        System.out.println("inputB");
        int inputB = scanner.nextInt();
        inputA =inputA-inputB;
        inputB =inputB+inputA;
        inputA=inputB-inputA;
        System.out.println("A = " + inputA);
        System.out.println("B = " + inputB);
    }
}
