import java.util.*;
public class Series11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=scanner.nextInt();
        double s=0;
        for (double i=1; i<=n; i++) {
            if (i%2==0) {
                s=s-(i+1.0)/(i+2.0);
            }
            else
                s=s+(i+1.0)/(i+2.0);
        }
        System.out.println("Sum = "+s);
        scanner.close();
    }
}
