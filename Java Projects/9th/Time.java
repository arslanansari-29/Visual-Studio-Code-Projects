import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first hour value");
        int h1 = sc.nextInt();
        System.out.println("Enter first minute value");
        int m1 = sc.nextInt();
        System.out.println("Enter second hour value");
        int h2 = sc.nextInt();
        System.out.println("Enter second minute value");
        int m2 = sc.nextInt();
        int h = h1+h2;
        int m = m1+m2;
            h = h+m/60;
            m = m%60;
            System.out.println("Total Time = "+h+"hr "+m+"min");
        sc.close();
    }
}
