package com.company.TaskDay4;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        Random random =new Random();
        int inputNum = random.nextInt();
        boolean a =inputNum>-1000&&inputNum<1000;
        System.out.println(a);
        boolean b = inputNum%3==0&&inputNum%5==0;
        System.out.println(b);
    }
}
