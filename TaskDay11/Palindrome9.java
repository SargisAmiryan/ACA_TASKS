package com.company.TaskDay11;

public class Palindrome9 {
    public  boolean isPalindrome (String number){
        int j = number.length()-1;
        boolean palindrome =true;
        for (int i = 0; i<=number.length()/2 ; i++) {
            if (number.charAt(i)!=number.charAt(j)){
                palindrome =false;
            } j--;
        }

        return palindrome;
    }
}
