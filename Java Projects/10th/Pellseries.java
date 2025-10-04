import java.util.Scanner;

public class Pellseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        int a=0, b=1, c=0, s=0;
        for(int i=1; i<=n; i++) {
            System.out.print(s+", ");
            c=a+b;
            a=b;
            s=b+c;
            b=c;
        }
        scanner.close();
    }
}
