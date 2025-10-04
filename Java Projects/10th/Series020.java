import java.util.*;
public class Series020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        double s=0.0;
        for(int i=1; i<=n; i++)
            s=s+i/(i+1.0);
        System.out.print("Sum = "+s);
        scanner.close();
    }
}
