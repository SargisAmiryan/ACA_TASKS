package com.company.TaskDay11;

public class isVowel8 {
    public static boolean isVowel(char ch) {
        char a = 'a';
        char A = 'A';
        char e = 'e';
        char E = 'E';
        char i = 'i';
        char I = 'I';
        char o = 'O';
        char O = 'O';
        char u = 'u';
        char U = 'U';
        if (a == ch || A == ch || e == ch || E == ch || i == ch || I == ch ||
                o == ch || ch == O || u == ch || U == ch) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isVowel('a'));
    }
}
