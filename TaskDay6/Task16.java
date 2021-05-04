package com.company.TaskDay6;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");
        int inputNum = scanner.nextInt();
        while (inputNum != randomNum) {
            if (inputNum > randomNum) {
                System.out.println("Too high, try again.");
            }
            if (inputNum < randomNum) {
                System.out.println("Too low, try again.");
            }
            inputNum = scanner.nextInt();


        }
        System.out.println("Yes, you guessed the number ");

    }
}
