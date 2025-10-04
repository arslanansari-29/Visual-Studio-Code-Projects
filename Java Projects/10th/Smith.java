 
 import java.util.Scanner;

public class Smith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scanner.nextInt();
        int c=n, s=0;
        while (c!=0) {
            int d=c%10;
            s+=d;
            c/=10;
        }
        c=n;
        int i=2, s1=0;
        while (c!=1) {
            int ci=i; //imp
            if(c%i==0) {
                while (ci!=0) {
                    int d=ci%10;
                    s1+=d;
                    ci/=10;
                }
                // System.out.println(i);
                c/=i;
            }
            else {
                i++;
                // ci=i;
            }
        }
        // System.out.println(s1);
        System.out.println(s1==s?"Smith number":"Not a Smith number");
        scanner.close();
    }
}
