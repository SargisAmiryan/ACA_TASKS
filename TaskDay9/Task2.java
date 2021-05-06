package com.company.TaskDay9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] matrix = new int[n][n];
        int x=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i].length - x == j) {
                    matrix[i][j] = 1;
                } else if (matrix[i].length - x >j){
                    matrix[i][j] = 0;
                }else if (matrix[i].length - x <j){
                    matrix[i][j] = 2;
                }
            }
            x++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
