package com.company.TaskDay9;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        int sum = 0;
        int maxIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == max) {
                    for (int k = 0; k < matrix[i].length; k++) {
                        sum  = sum+ matrix[i][k];
                    }
                    if (sum > maxSum) {
                        maxSum = sum;
                        maxIndex = i;
                    }
                    sum =0;
                }
            }
        }

        System.out.println("max = " + max + " max sum " + maxSum + "index " + maxIndex);

    }
}
