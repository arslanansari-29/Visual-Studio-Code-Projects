import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n;
        int r=0;
        while (c!=0) {
            int d=c%10;
            r=r*10+d;
            c/=10;
        }
        System.out.println(r==n?"Palindrome":"Not a Palindrome number");
        scanner.close();
    }
}
