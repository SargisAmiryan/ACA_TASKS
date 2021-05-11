package com.company.TaskDay8;

public class Task17 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int x=0;
        for (int i = 1; i <array.length-1 ; i++) {
            if (array[i-1]<array[i]&&array[i]<array[i+1]){
                x++;
            }else {
                System.out.println("not sorted");
                break;
            }
        }
        if (x==array.length-2){
            System.out.println("sorted");
        }
    }
}
