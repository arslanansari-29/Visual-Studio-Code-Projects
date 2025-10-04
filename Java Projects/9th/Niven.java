import java.util.Scanner;

public class Niven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int c=n, s=0;
        while (c!=0) {
            int d=c%10;
            s+=d;
            c/=10;
        }
        System.out.println(n%s==0?"Niven number":"Not a niven number");
        scanner.close();
    }
}

