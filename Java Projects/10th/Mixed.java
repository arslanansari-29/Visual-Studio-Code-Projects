import java.util.*;
public class Mixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        int c=n, s=0;
        for (int i=1; i<n; i++) {
            if (c%i==0) {
                s=s+i;
            }
        }
        if (s==n)
            System.out.println("Perfect number");
        else if (s<n)
            System.out.println("Deficient number");
        else if (s>n)
            System.out.println("Abundant number");
        else
            System.out.println("I don't know! FUCK OFF!");
        scanner.close();
    }
}
