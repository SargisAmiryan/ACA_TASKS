package com.company.TaskDay8;

public class Task8 {
    public static void main(String[] args) {
        int [] array = {1,4,6,9,9,56,24,24,35,35};
        int count=1;
        for (int i = 0; i <array.length-1; i++) {
            if (array[i]==array[i+1]){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
