import java.util.Scanner;

public class Dudency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n, s=0;
        while (c!=0) {
            int d=c%10;
            s+=d;
            c/=10;
        }
        System.out.println(s==(int)Math.cbrt(n)?"Dudency number":"Not a Dudency number");
        scanner.close();
    }
}