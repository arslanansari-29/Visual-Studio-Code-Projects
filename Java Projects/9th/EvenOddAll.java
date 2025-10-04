import java.util.*;
public class EvenOddAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n;
        int a=0, o=0, e=0;
        while (c!=0) {
            int d=c%10;
            c=c/10;
            a=a+d;
            if(d%2==0)
            e+=d;
            else
            o+=d;
        }
        System.out.println(a);
        System.out.println(e);
        System.out.println(o);
        scanner.close();
    }
}
