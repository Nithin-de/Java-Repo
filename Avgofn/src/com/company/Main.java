package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Calculate Average Of N Numbers
        Scanner in=new Scanner(System.in);
        int n,res=0,dig;
        float ans;
        System.out.println("Enter the number of digits you want to enter");
        n=in.nextInt();
        System.out.println("Enter " +n+ " digits");
        for (int i = 0; i <n ; i++) {
            dig=in.nextInt();
            res=res+dig;

        }
       
        System.out.print("Average is ");
        System.out.println( ans=(float) res/n);




    }
}
