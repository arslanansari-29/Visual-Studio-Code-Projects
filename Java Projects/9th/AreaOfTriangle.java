import java.util.*;
public class AreaOfTriangle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = sc.nextInt();
        System.out.println("Enter second side");
        int b = sc.nextInt();
        System.out.println("Enter third side");
        int c = sc.nextInt();
        double s = (a+b+c)/2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area = "+area+" units");
        sc.close();
    }
}