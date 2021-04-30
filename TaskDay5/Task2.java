package com.company.TaskDay5;

public class Task2 {
    public static void main(String[] args) {
        String literalString = "abcde";
        String notLiteralStr = new String("abcde");
        System.out.println("==" + literalString == notLiteralStr);
        System.out.println("equals" + literalString.equals(notLiteralStr));

    }
}
