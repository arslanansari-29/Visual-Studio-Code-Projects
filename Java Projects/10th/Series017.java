import java.util.*;
public class Series017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt(), s=0;
        for(int i=1; i<=n; i++) {
            int S=0;
            for(int j=1; j<=i; j++)
                S=S+j;
            s=s+S;
        }
        System.out.print("Sum = "+s);
        scanner.close();
    }
}
