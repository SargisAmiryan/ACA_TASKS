package com.company.TaskDay11;

public class Contains12 {
   public static boolean contains(int[] array,int key){
       boolean thereIs =false;
       for (int i = 0; i <array.length ; i++) {
           if (array[i]==key){
               thereIs =true;
               break;
           }
       }
       return thereIs;

   }

    public static void main(String[] args) {
        int [] array = {1,2,4,6,7,8,9};
        System.out.println(contains(array,5));
    }
}
