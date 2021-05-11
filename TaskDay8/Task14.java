package com.company.TaskDay8;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7};
        Scanner scanner =new Scanner(System.in);
        int k= scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (i==k){
                for (int j = k; j <array.length-1 ; j++) {
                    array[j]=array[j+1];
                }
                break;
            }
        }
        for (int i = 0; i <array.length -1 ; i++) {
            System.out.println(array[i]);
        }
    }
}
