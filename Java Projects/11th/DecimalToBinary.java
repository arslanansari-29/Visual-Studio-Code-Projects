import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(), p=0, rev=0;
        while (n>0) {
            rev = rev+(n%2)*(int)Math.pow(10, p);
            n = n/2;
            p++;
        }
        System.out.println("Binary representation: "+rev);
        scanner.close();
    }
}
