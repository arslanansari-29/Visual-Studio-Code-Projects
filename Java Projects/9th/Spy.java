import java.util.*;
public class Spy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n;
        int s=0, p=1;
        while (c!=0) {
            int d=c%10;
            c/=10;
            s+=d;
            p*=d;
        }
        if (s==p) {
            System.out.println("Spy number");
        }
        else
        System.out.println("Not a spy number");
        scanner.close();
    }
}
