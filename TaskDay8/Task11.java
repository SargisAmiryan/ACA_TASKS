package com.company.TaskDay8;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7};
        int x=0;
        for (int i = 0; i <array.length-1 ; i+=2) {
            x=array[i];
            array[i]=array[i+1];
            array[i+1]=x;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
