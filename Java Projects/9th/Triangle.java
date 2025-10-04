import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first angle");
        int a = sc.nextInt();
        System.out.println("Enter second angle");
        int b = sc.nextInt();
        System.out.println("Enter third angle");
        int c = sc.nextInt();
        if(a!=0 && b!=0 && c!=0 && a+b+c==180)
        {
            System.out.println("Triangle is possible");
        }
        else
        {
            System.out.println("Triangle is not possible");
        }
        sc.close();
    }
}
