import java.util.Scanner;

public class CompositeMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the starting number (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the ending number (n): ");
        int n = sc.nextInt();

        // Check for invalid range
        if (m > n) {
            System.out.println("Error: Starting number cannot be greater than ending number.");
            System.exit(0);
        }

        System.out.println("Composite Magic numbers between " + m + " and " + n + ":");

        // Loop through range
        for (int num = m; num <= n; num++) {
            // Composite check
            boolean isComposite = false;
            if (num > 1) {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isComposite = true;
                        break;
                    }
                }
            }

            // Magic check
            int temp = num;
            while (temp > 9) {
                int sum = 0;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                temp = sum;
            }
            boolean isMagic = (temp == 1);

            // Print if both conditions are true
            if (isComposite && isMagic) {
                System.out.print(num + " ");
            }
            sc.close();
        }
    }
}
