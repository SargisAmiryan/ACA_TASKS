package com.company.TaskDay8;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[100];
        for (int i = 0; i <array.length ; i++) {
            array[i]=i;
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                System.out.println(array[i]);
            }
        }
    }
}
