package com.company.TaskDay3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float inoutFahrenheit = scanner.nextFloat();
        float celsius = (inoutFahrenheit - 32) * 5 / 9;
        System.out.println("Celsius = " + celsius);
        int castCelsiusToInt = (int) celsius;
        System.out.println(" Int Celsius = " + castCelsiusToInt);
    }
}
