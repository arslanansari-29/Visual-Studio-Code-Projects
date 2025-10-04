import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int c=n, s=0, r=0, k=0;
        while (c!=0) {
            int d=c%10;
            r=r*10+d;
            c=c/10;
        }
        // System.out.println(r);
        while (r!=0) {
            int d=r%10;
            k++;
            s+=(int)(Math.pow(d, k));
            r/=10;
        }
        System.out.println(s==n?"Disarium number":"Not a Disarium number");
        scanner.close();
    }
}
