package com.company.TaskDay4;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int inputNum = scanner.nextInt();
        if (inputNum==1){
            System.out.println("Sunday" );
        }
        if (inputNum==2){
            System.out.println("Monday" );
        }
        if (inputNum==3){
            System.out.println("Tuesday " );
        }
        if (inputNum==4){
            System.out.println("Wednesday " );
        }
        if (inputNum==5){
            System.out.println("Thursday" );
        }
        if (inputNum==6){
            System.out.println("Friday" );
        }
        if (inputNum==7){
            System.out.println("Saturday " );
        }
    }
}
