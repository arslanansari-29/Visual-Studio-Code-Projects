import java.util.Scanner;

public class DigitFrequencyByUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        System.out.println("Enter a number to find it's frequency");
        int num = scanner.nextInt();
        int c=n, k=0;
        while (c!=0) {
            int d=c%10;
            if (d==num)
                k++;
            c/=10;
        }
        System.out.println("Digit: " + num+"\nFreqency: " + k);
        scanner.close();
    }
}
