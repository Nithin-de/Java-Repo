package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Volume of cone
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Radius and Height of the cone");

        float r,h,V;
        r= in.nextInt();
        h= in.nextInt();
        V= (float) (.33 * 3.14 * r*r * h);
        System.out.println("The Volume of the cone is="+V);








    }
}
