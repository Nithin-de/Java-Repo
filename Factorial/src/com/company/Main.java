package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number for which you want to check factorial");
        int n=in.nextInt();
      int fact=1;

        for (int i = 1; i <=n ; i++) {
            fact=fact*i;


        }
        System.out.print("The factorial is ");
        System.out.println(fact);



    }
}
