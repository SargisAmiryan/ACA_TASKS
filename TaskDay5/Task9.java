package com.company.TaskDay5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(" Capital of Armenia?\n 1 Lori \n 2 Ejmiacin \n 3 Yerevan \n 4 Sisyan ");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        switch (inputNum) {
            case 1: {
                System.out.println("Invalid choice");
                break;
            }
            case 2: {
                System.out.println("Invalid choice");
                break;
            }
            case 3: {
                System.out.println("Congratulation");
                break;
            }
            case 4: {
                System.out.println("Invalid choice");
                break;
            }
            default: {
                System.out.println("choose 1,2,3,4");
            }

        }
    }
}
