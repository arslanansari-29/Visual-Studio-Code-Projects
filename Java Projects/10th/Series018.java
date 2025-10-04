import java.util.Scanner;

public class Series018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt(), s=0;
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        for(int i=1; i<=n; i++) {
            s=s+a+i;
        }
        System.out.print("Sum = "+s);
        scanner.close();
    }
}
