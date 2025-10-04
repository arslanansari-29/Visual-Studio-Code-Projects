import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n, i=2;
        while (c!=1) {
            if(c%i==0) {
                System.out.println(i);
                c/=i;
            }
            else
                i++;
        }
        scanner.close();
    }
}
