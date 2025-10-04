import java.util.*;
public class AreaOfShapes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu \n1- Area of rectangle \n2- Area of square \n3- Area of circle \n4- Area of triangle\n5- Area of cone");
        int i = sc.nextInt();
        double l = 0.0, r = 0.0, b = 0.0, s= 0.0, h = 0.0;
        switch (i)
        {
            case 1:
            System.out.println("Enter length of rectangle");
            l=sc.nextDouble();
            System.out.println("Enter breadth");
            b=sc.nextDouble();
            System.out.println("Area of rectangle = "+(l*b));
            break;
            case 2:
            System.out.println("Enter side of square");
            s=sc.nextDouble();
            System.out.println("Area of square = "+(s*s));
            break;
            case 3:
            System.out.println("Enter radius of circle");
            r=sc.nextDouble();
            System.out.println("Area of circle = "+(22.0/7*r*r));
            break;
            case 4:
            System.out.println("Enter base of triangle");
            b=sc.nextDouble();
            System.out.println("Enter height of triangle");
            h=sc.nextDouble();
            System.out.println("Area of triangle = "+(1.0/2*b*h));
            case 5:
            System.out.println("Enter radius");
            r=sc.nextDouble();
            System.out.println("Enter slant length");
            l=sc.nextDouble();
            System.out.println("Enter height");
            h=sc.nextDouble();
            System.out.println("Area of cone = "+(22.0/7*r*(r+h)));
            break;
        }
        sc.close();
    }
}