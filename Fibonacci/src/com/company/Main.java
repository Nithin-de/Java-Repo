package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Scanner in=new Scanner(System.in);
        System.out.println("Enter the nth fibonacci ");
       int n=in.nextInt();
       int a=0;
       int b=1;
       int count=2;


       while (count<=n){
           int temp=b;
           b=a+b;
           a=temp;
           count++;
       }
        System.out.println(b);

    }
}
