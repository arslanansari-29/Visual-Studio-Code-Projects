import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                c = c + i;
            }
        }
        if (c==n) {
            System.out.println("It is a perfect number");
        }
        else
        System.out.println("It is not a Perfect number");
        scanner.close();
    }
}
