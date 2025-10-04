import java.util.*;
public class PYQ2024_Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int c=n, r=0, s=0;
        while(c!=0) {
            int d=c%10;
            s+=d;
            r=r*10+d;
            c/=10;
        }
        System.out.print(r==n && s%2==0?"EvenPal":"Not an EvenPal");
        scanner.close();
    }
}
