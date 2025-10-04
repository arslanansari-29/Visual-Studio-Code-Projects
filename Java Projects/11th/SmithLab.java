import java.util.Scanner;

public class SmithLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT: ");
        System.out.print("Starting range: ");
        int start = scanner.nextInt();
        System.out.print("Ending range: ");
        int end = scanner.nextInt();
        System.out.println("OUTPUT: ");
        for(int i=start; i<=end; i++) {
            if(isComposite(i) && sumOfDigits(i) == sumOfFactorials(i))
                System.out.print(i + ", ");
        }

    }

    static boolean isComposite(int n) {
        for(int i=2; i<=n/2; i++)
            if(n%i==0)
                return true;
        return false;
    }

    static int sumOfDigits(int n) {
        int s=0;
        while (n!=0) {
            s+=n%10;
            n/=10;
        }
        return s;
    }

    static int sumOfFactorials(int n) {
        int i=2, s=0;
        while (n>1) {
            if(n%i==0) {
                s+=sumOfDigits(i);
                n/=i;
            }
            else
                i++;
        }
        return s;
    }
}
