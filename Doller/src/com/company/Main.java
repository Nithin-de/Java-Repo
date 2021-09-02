package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Input currency in rupees and output in dollar
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the amount in rupees");
        float rupee=in.nextInt();
        float doller= (float) (rupee/73.07);
        System.out.println("Amount in dollar="+ doller);









    }
}
