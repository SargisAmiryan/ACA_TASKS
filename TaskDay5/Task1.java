package com.company.TaskDay5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println( "with == operator " +  (str1 == str2 ) );
        System.out.println("with equals " + str1.equals(str2));


    }
}
