import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int c=a;
        while (c%b!=0) {
            c+=a;
        }
        System.out.println("LCM = " + c);
        scanner.close();
    }
}
