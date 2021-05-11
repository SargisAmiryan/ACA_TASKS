package com.company.week3day2;

public class Task4 {
    public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if (array.length-1==i){
                System.out.print(array[i]+"]");
                break;
            }
            System.out.print(array[i]+",");
        }
    }
    public static void print(float[] array){
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if (array.length-1==i){
                System.out.print(array[i]+"]");
                break;
            }
            System.out.print(array[i]+",");
        }
    }
    public static void print(double[] array){
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if (array.length-1==i){
                System.out.print(array[i]+"]");
                break;
            }
            System.out.print(array[i]+",");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        print(array);
    }
}
