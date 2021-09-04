import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//  The volume of a prism is given as V = B × H where, "V" is the volume of the prism,
//  "B" is the base area of the prism, and "H " is the height of the prism. How to Find the Volume of Prism?

        System.out.println("Enter the base area and height of the prism");
     float V,B,H;
     B=in.nextInt();
     H=in.nextInt();
     V=B*H;
        System.out.println("The volume of the prism is="+V);








    }
}
