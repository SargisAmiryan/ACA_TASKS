package com.company.TaskDay8;

public class Task12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int x=array[array.length-1];
        for (int i = array.length-1; i >0; i--) {
            array[i]=array[i-1];

        }
        array[0]=x;
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
