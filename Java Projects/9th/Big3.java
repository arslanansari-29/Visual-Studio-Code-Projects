import java.util.Scanner;

public class Big3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int T = a;
        if (T<b)
        {
            T = b;
        }
        if (T<c)
        {
            T = c;
        }
        System.out.println(+T);
        sc.close();
    }
}
