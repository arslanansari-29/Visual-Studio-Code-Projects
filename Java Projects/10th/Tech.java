import java.util.Scanner;
public class Tech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int c=n, k=0, s=0;
        while (c!=0) {
            k++;
            c/=10;
        }
        if(k%2==0) {
            int h1=n/(int)Math.pow(10,k/2);
            // System.out.println(n);
            int h2=n%(int)Math.pow(10,k/2);
            // System.out.println(n);
            s=h1+h2;
            // int sq=s*s;
            System.out.println(s*s==n?"Tech number":"Not a Tech number");
            // System.out.println(h1);
            // System.out.println(h2);
        }
        else
            System.out.println("Number of digits are odd");
        scanner.close();
    }
}