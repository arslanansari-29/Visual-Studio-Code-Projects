import java.util.Scanner;

public class Special {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int c = n, s = 0;
        while (c!=0) {
            int d = c%10;
            int f=1;
            for (int i = 1; i <= d; i++) 
                f=f*i;
            s+=f;
            c/=10;
        }
        System.out.println(s);
        System.out.println(s==n?"Special number":"Not a special number");
        scanner.close();
    }
}