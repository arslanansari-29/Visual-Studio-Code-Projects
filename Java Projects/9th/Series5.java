import java.util.Scanner;

public class Series5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int a = 0;
        for(int i = 1; i <= n; i++) {
            a=a+i*i;
            System.out.println(a);
        }
        scanner.close();
    }
}
