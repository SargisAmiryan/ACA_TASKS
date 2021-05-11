package com.company.TaskDay8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int [] array = {1,-1,0,-5,3,34,65,78};
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i+1]>array[i]){
                System.out.println(array[i+1]);
            }
        }

    }
}
