package com.company.TaskDay4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        int x = num % 10;
        if (x < 0) {
            x = -x;
        }
        if (x < 2) {
            x += 3;
            System.out.println(x);
        } else if (x > 7) {
            x -= 2;
            System.out.println(x);
        } else {
            System.out.println(x);
        }


    }
}
