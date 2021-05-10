package com.company.TaskDay11;

import java.util.Scanner;

public class MagicSum11 {
    public static int MagicSum(int number) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (number != -1) {
            for (int i = number; i > 0; i /= 10) {
                if (i % 10 == 8) {
                    sum = sum + number;
                    break;
                }

            }
            System.out.println("Enter a positive integer");
            number = scanner.nextInt();

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(MagicSum(11));
    }

}
