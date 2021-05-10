package com.company.TaskDay10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        boolean polid =true;
        for (int i = 1; i <num.length() ; i++) {
            if (num.charAt(i-1)!=num.charAt(num.length()-i)){
                polid =false;
                break;
            }
        }
        System.out.println(polid);
    }
}
