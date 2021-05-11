package com.company.TaskDay8;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 9, 56, 24, 13};
        int x = 0;
        for (int i = 0; i < array.length / 2; i++) {
            x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
