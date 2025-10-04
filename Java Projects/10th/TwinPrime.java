import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int c = n;
        System.out.println("Enter second number");
        int n1 = scanner.nextInt();
        int c1 = n1;
        int k = 0, k1= 0;
        for (int i = 1; i <= c; i++) {
            if(c%i==0)
                k++;
        }
        for (int i = 1; i <= c1; i++) {
            if(c1%i==0)
                k1++;
        }
        System.out.println(k==2 && k1==2 && Math.abs(n-n1)==2?"Twin Prime number":"Not a Twin Prime number");
        scanner.close();
    }
}
