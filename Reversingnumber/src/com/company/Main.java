package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int n;
         n=in.nextInt();
        int ans=0;


        while (n>0){
            int rem=n%10;
            n /= 10;
            ans=ans*10+rem;

        }


     System.out.println("The reversed number is " + ans);
}}
