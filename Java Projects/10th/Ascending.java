import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt(), r=0;
        for (int i=0; i<=9; i++) {
            int c=n;
            while (c!=0) {
                int d=c%10;
                if(d==i)
                    r=r*10+d;
                c/=10;
            }
        }
        System.out.println("Ascending order= "+r);
        scanner.close();
    }
}
