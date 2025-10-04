import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first kilometre value");
        int km1 = sc.nextInt();
        System.out.println("Enter first metre value");
        int m1 = sc.nextInt();
        System.out.println("Enter second kilometre value");
        int km2 = sc.nextInt();
        System.out.println("Enter second metre value");
        int m2 = sc.nextInt();
        int km = km1+km2;
        int m = m1+m2;
            km = km+m/1000;
            m = m%1000;
        System.out.println("Total Distance = "+km+"km "+m+"m");
        sc.close();
    }
}
