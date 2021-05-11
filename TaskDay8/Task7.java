package com.company.TaskDay8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int [] array=new int[1000];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            array[i]=scanner.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i]<min&&array[i]>0){
                min=array[i];
            }

        }
        System.out.println(min);
    }
}
