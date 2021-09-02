package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Take two numbers and an operator and calculate the value
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println("Enter the operator you want to perform");
       String ope=in.nextInt();

        if (ope =="+") {
            int sum=n1+n2;
            System.out.println("sum="+sum);
        }
           else if(ope=='-'){
                int diff=n1-n2;
        System.out.println("Diff="+diff);
    }
            else if(ope=='*'){
                int mult=n1*n2;
        System.out.println("Multiplication ="+mult);
    }
            else if(ope=='/')
    {
        int div=n1/n2;
        System.out.println("Div="+div);
    }
            else{
        System.out.println("Invalid operator");
    }
        }}

