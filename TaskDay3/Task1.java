package com.company.TaskDay3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please give your Variable ");
        byte inputVariable = scanner.nextByte();
        short castToShort = (short) inputVariable;
        System.out.println("input Byte is " + inputVariable + " short " + castToShort);
        int castToInt = (int) castToShort;
        System.out.println(" short " + castToShort + " int " + castToInt);
        long castToLong = (long) castToInt;
        System.out.println("int " + castToInt + " long  " + castToLong);
        float castToFloat = (float) castToLong;
        System.out.println("long " + castToLong + " float " + castToFloat);
        double castToDouble = (double) castToFloat;
        System.out.println("float " + castToFloat + " double " + castToDouble);


    }
}
