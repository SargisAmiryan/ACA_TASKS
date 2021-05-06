package com.company.TaskDay6;

public class Task10 {
    public static void main(String[] args) {
        int i = 32;
        int count =0;
        while (i <= 122) {
            System.out.print((char) i +" ");
            i++;
            count++;
            if (count%10==0){
                System.out.println("\n");
            }
        }
    }
}
