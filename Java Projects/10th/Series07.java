import java.util.*;
public class Series07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt(), a=5;
        for (int i = 1; i <= n; i++) {
            System.out.print(a+", ");
            a=i%2==0?a+4:a+3;
        }
        scanner.close();
    }
}
