import java.util.Scanner;

public class Series025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        System.out.print("Enter a number: ");
        int a=scanner.nextInt(), b=1;
        double s=0.0, d=2.0;
        for (int i=1; i<=n; i++) {
            s=s+b-a/d;
            d=d+2;
            b=b+2;
        }
        System.out.print("Sum = "+s);
        scanner.close();
    }
}
