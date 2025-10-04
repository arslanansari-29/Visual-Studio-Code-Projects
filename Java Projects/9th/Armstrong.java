import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = scanner.nextInt();
            int c=n, k=0;
            while (c!=0) {
                k++;
                c/=10;
            }   c=n;
            int s=0;
            while (c!=0) {
                int d=c%10;
                s=s+(int)Math.pow(d,k);
                c/=10;
            }   System.out.println(n==s?"Armstrong number":"Not a armstring number");
        }
    }
}
