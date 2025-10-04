import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = scanner.nextInt();
        int a = 2;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a=a+2;
        }
        scanner.close();
    }
}
