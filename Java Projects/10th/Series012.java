import java.util.Scanner;
public class Series012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt(), a=1;
        for(int i=1; i<=n; i++) {
            a=a*i;
            System.out.print(a+", ");
        }
        scanner.close();
    }

}
