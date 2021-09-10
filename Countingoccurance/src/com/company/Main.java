package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
  Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
  int n=in.nextInt();
        System.out.println("Enter the number you want to check");
        int c=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==c){
                count++;
            }
            n=n/10;
        }

        System.out.println( c +" is repeated " +count +" times");









    }
}
