package com.company.TaskDay8;

public class Task18 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 5, 5, 5, 5, 6, 7};
        boolean a = false;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {

                    if (x == array[i]) {
                        continue;
                    }
                    x = array[i];
                    a = true;
                }
            }
            if (a) {
                System.out.println(array[i]);
            }
            a = false;

        }

    }
}
