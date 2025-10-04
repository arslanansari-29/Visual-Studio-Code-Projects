import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breadth");
        int b = sc.nextInt();
        int a = 2*(l+b);
        System.out.println("Area of rectangle = "+a+" units");
        sc.close();
    }
}
