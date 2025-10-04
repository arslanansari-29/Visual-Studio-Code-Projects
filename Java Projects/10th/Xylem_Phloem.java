import java.util.*;
public class Xylem_Phloem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        int c=n, k=0;
        // int fd=c%10;
        // int ld=c%10;
        // s=fd+ld;
        while (c!=0) {
            // int d=c%10;
            k++;
            c/=10;
        }
        // System.out.println(k);
        c=n;
        int ld=c%10;
        // System.out.println(ld);
        // c=c/10;
        int fd=c/(int)Math.pow(10, k-1);
        // System.out.println(fd);
        int a=c/10;
        // System.out.println(a);
        int ca=a;
        k=0;
        while (ca!=0) {
            k++;
            ca=ca/10;
        }
        ca=a;
        int b=ca%(int)Math.pow(10, k-1);
        // System.out.println(b);
        int cb=b, s=0;
        while (cb!=0) {
            int d = cb%10;
            s=s+d;
            cb=cb/10;
        }
        // System.out.println(s);
        int s1=ld+fd;
        System.out.println(s1==s?"Xylem number":"Phloem number");
        scanner.close();
    }
}