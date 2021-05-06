//package com.company.TaskDay9;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Task9 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] matrix = new int[n][m];
//
//        for (int i = 0; i <matrix.length ; i++) {
//            for (int j = 0; j <matrix[i].length ; j++) {
//                if (i==matrix.length-1||j==matrix.length-1){
//                    matrix[i][j]=1;
//                }
//                if (i==matrix.length-3||j==matrix.length-3){
//                    matrix[i][j]=1;
//                }
//            }
//
//        }
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    System.out.print(matrix[i][j] + " ");
//                }
//                System.out.println();
//
//        }
//    }
//}
