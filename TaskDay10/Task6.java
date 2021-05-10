package com.company.TaskDay10;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  wordArray = scanner.next();
        boolean x = true;
        String word1 ="";
        if (wordArray.charAt(0)>90){
          word1+=(char) (wordArray.charAt(0)-32);
        }else {
            word1 += (char)wordArray.charAt(0);
        }
        if (wordArray.charAt(0)<97){
            word1+=(char)(wordArray.charAt(1)+32);
        }else {
            word1 += (char)wordArray.charAt(1);
        }
        if (wordArray.charAt(0)<97){
            word1+=(char) (wordArray.charAt(2)+32);
        }else {
            word1 += (char)wordArray.charAt(2);
        }
        System.out.println("Correct word " + word1);
        
    }
}

