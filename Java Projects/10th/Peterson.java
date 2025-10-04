import java.util.Scanner;

public class Peterson {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt(),c=n,s=0;
        while (c!=0) {
            int d=c%10,p=1;
            for (int i=d; i>=1; i--)
                p*=i;
            s+=p;
            c/=10;
        }
        System.out.println(s==n?"Peterson number":"Not a Peterson number");
        scanner.close();
    }
}