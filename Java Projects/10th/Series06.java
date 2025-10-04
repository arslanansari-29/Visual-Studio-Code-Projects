import java.util.Scanner;

public class Series06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=scanner.nextInt();
        for(int i=1; i<=n; i++)
            System.out.print(i*i+1+", ");
        scanner.close();
    }
}
