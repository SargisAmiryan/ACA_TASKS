package com.company.TaskDay11;

public class Election4 {
   public static boolean election(boolean x, boolean y, boolean z){
        if (x && y || y && z || x && z){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(election(true,true,true));
    }
}
