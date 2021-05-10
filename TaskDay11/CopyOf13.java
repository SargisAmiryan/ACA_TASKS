package com.company.TaskDay11;

public class CopyOf13 {
    public static int[] copyOf(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 8, 9};
        int [] newArray = copyOf(array);
        for (int i = 0; i <newArray.length ; i++) {
            System.out.println(newArray[i]);
        }
    }
}

