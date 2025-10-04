import java.util.Scanner;

public class Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Enter fourth number: ");
        int d = sc.nextInt();
        if(a>b)
        {
            System.out.println(+a+" is the greatest");
        }
        if(b>c)
        {
            System.out.println(+b+" is the greatest");
        }
        if(c>d)
        {
            System.out.println(+c+" is the greatest");
        }
        if(d>a)
        {
            System.out.println(+d+" is the greatest");
        }
        sc.close();
    }
}
