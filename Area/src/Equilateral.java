import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the side of the Equilateral triangle");
        int a;
        float A;
        a=in.nextInt();
        A= (float) (.866*a*a);
        System.out.println("The area of Equilateral triangle is="+A);





    }
}
