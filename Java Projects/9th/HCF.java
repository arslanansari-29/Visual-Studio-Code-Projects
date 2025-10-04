import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        while (a!=b) {
            if (a>b) {
                a=a-b;
            }
            if (b>a) {
                b=b-a;
            }
        }
        System.out.println(a);
        scanner.close();
    }
}
