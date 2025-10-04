import java.util.Scanner;

public class Big1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c=a;
        if(c<b)
        {
            System.out.println(+b+" is the greatest");
        }
        else
        {
            System.out.println(+c+" is the greatest");
        }
        sc.close();
    }
}
