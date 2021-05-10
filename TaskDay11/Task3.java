package com.company.TaskDay11;

public class Task3 {
    public static boolean xor (boolean a, boolean b){
//        if (a==false&&b==false||a&&b){
//            return false;
//        }else {
//            return true;
//        }
        return a^b;
    }

    public static void main(String[] args) {
        System.out.println(xor(false,true));
    }
}
