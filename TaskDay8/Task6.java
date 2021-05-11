package com.company.TaskDay8;

public class Task6 {
    public static void main(String[] args) {
        int [] array = {1,-1,0,-5,3,78,65,34,78};
        int max =Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max =array[i];
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==max){
                System.out.println(i+" "+ max);
                break;
            }

        }
    }
}
