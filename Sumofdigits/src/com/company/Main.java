package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Take integer inputs till the user enters 0 and print the sum of all numbers

        Scanner in=new Scanner(System.in);
        int a=1;
         int sum=0;
        while(a!=0){
            System.out.println("Enter the number");
            a=in.nextInt();
         sum=sum+a;
        }
        System.out.println(sum);

    }
}
