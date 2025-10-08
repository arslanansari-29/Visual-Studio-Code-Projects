import java.util.Scanner;

public class Goldbach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: N = ");
        int n=sc.nextInt();
        System.out.print("OUTPUT: ");
        if(n%2!=0) {
            System.out.print("INVALID INPUT. NUMBER IS ODD.");
            System.exit(0);
        }
        if(n<9 || n>50) {
            System.out.print("INVALID INPUT. SIZE OUT OF RANGE");
            System.exit(0);
        }
        System.out.println("PRIME PAIRS ARE: ");
        for(int i=1, j=n-1; i<=j; i++, j--) {
            if(Utils.isPrime(i) && Utils.isPrime(j)) {
                System.out.println(i + " + " + j + " = " + n);
            }
        }
        sc.close();
    }
}
