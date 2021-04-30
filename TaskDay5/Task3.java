package com.company.TaskDay5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num>0 ? "positive" :num==0?"num=0":"negative" );
    }
}
