import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1- Volume of Cube\n2- Volume of cuboid\n3- Volume of Sphere\nEnter your choice");
        int a = sc.nextInt();
        double l=0.0, b=0.0, h=0.0, r=0.0;
        switch (a) {
            case 1:
                System.out.println("Enter side of Cube");
                l=sc.nextDouble();
                System.out.println("Volume of Cube = "+(l*l*l));
                break;
            case 2:
                System.out.println("Enter lenght of Cuboid");
                l = sc.nextDouble();
                System.out.println("Enter breadth of Cuboid");
                b=sc.nextDouble();
                System.out.println("Enter height of Cuboid");
                h=sc.nextDouble();
                System.out.println("Volume of Cuboid = "+(l*b*h));
                break;
            case 3:
                System.out.println("Enter radius of circle");
                r=sc.nextDouble();
                System.out.println("Volume of Circle= "+(4.0/3*22.0/7*r*r*r));
            default:
                break;
        }
        sc.close();
    }
}
