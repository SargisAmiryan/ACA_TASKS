package com.company.TaskDay7;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int pass = Integer.valueOf(num);
        for (int i = 64; i <=90 ; i++) {
            if(pass==i){
                break;
            }else {
                System.out.println("try again you have not [A-Z]or @");
                num = scanner.next();
            }

        }
        for (int i = 97; i <=122 ; i++) {
            if(pass==i){
                break;
            }else {
                System.out.println("try again you have not [a-z]");
                num = scanner.next();
            }

        }
        for (int i = 23; i <=24 ; i++) {
            if(pass==i){
                break;
            }else {
                System.out.println("try again you have not [$ #]");
                num = scanner.next();
            }
            
        }
        for (int i = 48; i <=57 ; i++) {
            if(pass==i){
                break;
            }else {
                System.out.println("try again you have not [0-9]");
                num = scanner.next();
            }
            
        }
        System.out.println("valid " +num);
    }
}
