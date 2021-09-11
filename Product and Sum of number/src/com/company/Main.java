package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Subtract the Product and Sum of Digits of an Integer
//        Input: n = 234
//        Output: 15
//        Explanation:
//        Product of digits = 2 * 3 * 4 = 24
//        Sum of digits = 2 + 3 + 4 = 9
//        Result = 24 - 9 = 15
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int result=1;
        int sum=0;
        int product=1;
        while (n>0){
            int rem=n%10;
            product=product*rem;
            sum=sum+rem;
            result=product-sum;
            n=n/10;
        }
        System.out.println("Product of digits " +product);
        System.out.println("Sum of digits " +sum);

        System.out.println( "Result = " +result);

    }




}









