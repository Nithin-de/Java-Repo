import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Cylinder’s volume is given by the formula, πr2h,
        // where r is the radius of the circular base and h is the height of the cylinder
        System.out.println("Enter the radius of the circular base and the height of the cylinder");
   float V,r,h;
   r=in.nextInt();
   h=in.nextInt();
   V= (float) (3.14*r*2*h);
        System.out.println("The volume of the cylinder is="+V);






    }
}
