package com.company.TaskDay8;

public class Task5 {
    public static void main(String[] args) {
        int [] array = {-2,1,4,-5,3,34,65,78};
        for (int i = 1; i <array.length ; i++) {
            if (array[i]>0&&array[i-1]>0){
                System.out.println(array[i-1]+"  "+array[i]);
                break;
            }else if (array[i]<0&&array[i-1]<0){
                System.out.println(array[i-1]+"  "+array[i]);
                break;
            }
        }
    }
}
