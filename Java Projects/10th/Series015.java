import java.util.*;
public class Series015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt(), s=0, a=2;
        for(int i=1; i<=n; i++) {
            s=i%2==0?s-a:s+a;
            a=a+2;
        }
        System.out.print("Sum = "+s);
        scanner.close();
    }
}
