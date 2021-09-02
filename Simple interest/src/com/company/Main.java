package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a program to input principle,time,and rate(PTR)from the user and find the Simple Interest
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Principle amount in rupees");
        int p=in.nextInt();
        System.out.println("Enter the Simple interest Time in Year's");
    float t= in.nextFloat();
        System.out.println("Enter the Simple interest Rate in %");
    float r= in.nextFloat();

    float si=(p*t*r)/100;
        System.out.println("Simple interest is"+" " +si  +" "+"rupees");


    }
}
