package com.company.TaskDay11;

import java.util.Scanner;

public class NumberStudents15 {
    public static void gradeStudents(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        float average = numStudents;
        int [] array = new int[numStudents];
        int count =0;
        while (numStudents>0){
            System.out.println("Enter the grade for student"+count+1);
            int grade = scanner.nextInt();
                array[count++] =grade;
            numStudents--;
        }
        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        float sum =0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];
            if (array[i]>max)
                max=array[i];
            if (array[i]<min)
                min =array[i];
        }
        System.out.println("max =" + max);
        System.out.println("min =" + min);
        System.out.println("average =" + String.format("%.2f",(sum/average)));
    }

    public static void main(String[] args) {
        gradeStudents();
    }
}
