import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scanner.nextInt();
        int c=n,s=0;
        while (c!=0) {
            int d=c%10;
            s+=d;
            c/=10;
        }
        int cs=s,s1=0;
        while (cs!=0) {
            int d=cs%10;
            s1+=d;
            cs/=10;
            
        }
        System.out.println(s1==1?"Magic number":"Not a Magic number");
        scanner.close();
    }
}