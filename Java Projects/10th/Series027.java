import java.util.Scanner;

public class Series027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        System.out.print("Enter a number: ");
        double a = scanner.nextDouble(), s=0.0, d=3.0;
        for(int i=1; i<=n; i++) {
            s=s+(a+i)/d;
            d=d+2;
        }
        System.out.print("Sum = "+s);
        scanner.close();
    }
}
