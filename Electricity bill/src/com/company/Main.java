package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        1 to 100 units – Rs. 10/unit
//        100 to 200 units – Rs. 15/unit
//        200 to 300 units – Rs. 20/unit
//        above 300 units – Rs. 25/unit
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of units");
        int n=in.nextInt();
        if(n<=100){
            int units=n*10;
            System.out.println(units);
        }
        else if(n<=200){
            int units=1000+((n-100)*15);
            System.out.println(units);
        }
        else if(n<=300){
            int units=2500+((n-200)*20);
            System.out.println(units);
        }
        else if(n>300){
            int units=((n-300)*25)+4500;
            System.out.println(units);
        }



    }
}
