package com.company.TaskDay5;

import java.util.Scanner;

public class Task10one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}
