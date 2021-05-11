package com.company.week3day2;

public class Task5 {
    public static int search(int[ ] array){
        return array.length;
    }
    public static int search(int[ ] array, int a){
        int x = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==a) {
                x=i;
               break;
            }
        }
       return x;
    }
    public static boolean search(int[] array, int argument, int index){
        boolean x = false;
        for (int i = 0; i <array.length ; i++) {
            if (array[index]==argument){
                x=true;
            }
        }
        return x;
    }
}
