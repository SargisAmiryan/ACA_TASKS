package com.company.TaskDay11;

public class hashEight10 {
    public static boolean hasEight (int number){
        boolean thereIs =false;
        for (int i = number; i >0 ; i/=10) {
            if (i%10==8){
                thereIs =true;
                break;
            }
        }
        return thereIs;
    }

    public static void main(String[] args) {
        int a = 125;
        System.out.println(hasEight(a));
    }
}
