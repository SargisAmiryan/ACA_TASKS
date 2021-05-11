package com.company.TaskDay8;

public class Task13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxIndex=0;
        int minIndex=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max) {
                max=array[i];
                maxIndex=i;
            }
            if (array[i] < min) {
                min=array[i];
                minIndex=i;
            }

        }
        for (int i = 0; i <array.length ; i++) {
            if(i==maxIndex){
                array[i]=min;
            }
            if(i==minIndex){
                array[i]=max;
            }

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
