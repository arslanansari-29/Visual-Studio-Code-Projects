import java.util.*;
public class Series6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int a = 1, s=2;
        for (int i = 1; i <+ n; i++) {
            a=a*s;
            System.out.println(a);
            s++;
        }
        scanner.close();
    }
}
