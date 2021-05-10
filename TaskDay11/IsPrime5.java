package com.company.TaskDay11;

public class IsPrime5 {
    public static boolean isPrime(int n) {
        boolean a = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                a = false;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(18));
    }
}
