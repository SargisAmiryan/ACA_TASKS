package com.company.TaskDay3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give variable ");
        double inputVariable = scanner.nextDouble();
        float castToFloat = (float) inputVariable;
        System.out.println("double " + inputVariable + "float " + castToFloat);
        long castToLong = (long) castToFloat;
        System.out.println("float " + castToFloat + "long  " + castToLong);
        int castToInt = (int) castToLong;
        System.out.println("long  " + castToLong + "int  " + castToInt);

        short castToShort = (short) castToInt;
        System.out.println("int  " + castToInt + "short " + castToShort);

        byte castToByte = (byte) castToShort;
        System.out.println("short " + castToShort + " byte  " + castToByte);


    }
}
