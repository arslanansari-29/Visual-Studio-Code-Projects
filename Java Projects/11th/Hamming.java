import java.util.Scanner;

public class Hamming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int n = scanner.nextInt(), c = n;
        System.out.print(n + " = ");
        if(n<0)
            System.out.print("Negative Number");
        else {
            int[] arr = new int[]{2,3,5};
            for(int i = 2; i<=n && n > 1;) {
                if(n % i == 0 ) {
                    System.out.print(i);
                    n = n / i;
                    if(n > 1)
                        System.out.print(" x ");
                }
                else
                    i++;
            }
            System.out.println();
            n=c;
            for(int i = 0; i < arr.length;) {
                if(n % arr[i] == 0)
                    n = n / arr[i];
                else
                    i++;
            }
            System.out.print(n==1?"Hamming number":"Not a Hamming number");
        }
        scanner.close();
    }
}
