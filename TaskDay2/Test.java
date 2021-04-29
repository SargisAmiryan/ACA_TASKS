package com.company.TaskDay2;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("please input your text ");
        String text = scanner.nextLine();
        System.out.println(text);
        Random random =new Random();
        int randomInt = random.nextInt();

        int randomIntBound = random.nextInt(100);
        System.out.println(randomInt);
        System.out.println(randomIntBound);
        for (int i = 0; i <1000; i++) {

        }

    }
}
