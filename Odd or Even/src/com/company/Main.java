package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a number to check whether it is odd or even");
        int num=in.nextInt();
        if(num%2==0){
            System.out.println("It's an Even Number");
        }
        else {
            System.out.println("It's an Odd Number");
        }

    }
}
