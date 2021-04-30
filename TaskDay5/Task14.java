package com.company.TaskDay5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade (0-100)");
        int quizScore  = scanner.nextInt();
        int midTermScore = scanner.nextInt();
        int finalScore = scanner.nextInt();
        int output = (quizScore+midTermScore+finalScore)/3;
        System.out.println(output);
        int x =0 ;
        if(output/10 >=8)
        {
          x=1;
        }else if(output/10 >=6&&output/100 <8)
        {
            x=2;
        }else if(output/10 >=4&&output/100 <6 )
        {
            x=3;
        }else if(output/10 >=0&&output/100 <4 )
        {
            x=4;
        };
        switch (x){
            case 1:{
                System.out.println("grade=A");
                break;
            }
            case 2:{
                System.out.println("grade=b");
                break;
            }
            case 3:{
                System.out.println("grade=c");
                break;
            }
            case 4:{
                System.out.println("grade=F");
                break;
            }
            default:
            {System.out.println("out of bound" );}

        }
    }
}
