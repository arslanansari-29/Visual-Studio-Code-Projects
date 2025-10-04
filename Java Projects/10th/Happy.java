import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int c = n;
        do {
            int s=0;   
            while (c!=0) {
                int d=c%10;
                s+=d*d;
                c/=10;
            }
            c=s;  
        } while (c>9);
        System.out.println(c==1?"Happy number":"Not a Happy number");
        scanner.close();
    }
}