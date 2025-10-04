import java.util.*;
public class Series10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=scanner.nextInt();
        double s=0;
        for (double i=1; i<=n; i++) {
            s = s+i/(i+1.0);
        }
        System.out.println(s);
        scanner.close();
    }
}
