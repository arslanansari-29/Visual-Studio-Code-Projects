import java.util.Scanner;

public class SuperPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int c=n, sq=n*n, r=0, sq1=sq;
        while (c!=0) {
            int d=c%10;
            r=r*10+d;
            c/=10;
        }
        int r1=0;
        while (sq1!=0) {
            int d=sq1%10;
            r1=r1*10+d;
            sq1/=10;
        }
        System.out.println(r==n&&r1==sq?"Super Palindrome number":"Not a Super Palindrome number");
        scanner.close();
    }
}