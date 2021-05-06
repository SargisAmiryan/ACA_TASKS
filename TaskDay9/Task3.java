package com.company.TaskDay9;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        boolean a = true;
        int l = 0;
        int n =1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i== j) {
                    matrix[i][j] = 1;
                } else if (i>j) {
                    matrix[i][j] =4;
                }else {
                    //you can check the program work ...just chang this 5 to 4
                    matrix[i][j] =5;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]!=matrix[j][i]){
                    a=false;

                    break;
                }
            }
        }

        System.out.println(a);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


}

