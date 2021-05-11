package com.company.week3day2;

public class Task9 {
    public static void  fahrenheitCelsius(float celsius ,int choice){
           double far = (celsius -32)*5/9;
           if (choice==1){
               System.out.println("fahrenheit = "+(int)far+" , celsius = "+celsius);
           }else if (choice==2){
               System.out.println("fahrenheit = "+far+" , celsius = "+celsius);
           }else {
               System.out.println("illegal argument");
           }
    }
}
