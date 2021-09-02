import java.util.Scanner;

public class isosceles {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Base and Height of the isosceles triangle");
        int b,h;
        float A;
        b=in.nextInt();
        h=in.nextInt();
        A= (float) (.5*b*h);
        System.out.println("The area of Isosceles triangle is="+A);




    }







}
