import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //volume = (4/3) · π · r3

        System.out.println("Enter the radius ");
  float V,r;
  r=in.nextInt();
  V= (float) ((.75)*3.14*r*r*r);
        System.out.println("The volume of sphere is="+V);










    }
}
