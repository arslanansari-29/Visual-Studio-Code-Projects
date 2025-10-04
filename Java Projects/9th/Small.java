import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int d = a;
        if(d>b)
        {
            d = b;
        }
        if(d>c)
        {
            d = c;
        }
        System.out.println(d);
        sc.close();
    }
}
