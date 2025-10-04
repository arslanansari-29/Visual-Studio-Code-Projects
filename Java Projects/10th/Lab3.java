import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = scanner.nextInt(), k=0;
        System.out.print("Enter second number: ");
        int n1 = scanner.nextInt(), k1=0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) 
                k++;
        }
        for(int i=1; i<=n1; i++) {
            if(n1%i==0) 
                k1++;
        }
        System.out.println(k==2 && k1==2 && Math.abs(n-n1)==2?"Twin Prime number":"Not a Twin Prime number");
        scanner.close();
    }
}
