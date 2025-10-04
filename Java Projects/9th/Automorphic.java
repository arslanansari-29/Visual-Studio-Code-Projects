import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n, sq=n*n, k=0;
        while (c!=0) {
            k++;
            c/=10;
        }
        int r=sq%(int)Math.pow(10, k);
        System.out.println(r==n?"Automorphic Number":"Not a Automorphic number");
        scanner.close();
    }
}
