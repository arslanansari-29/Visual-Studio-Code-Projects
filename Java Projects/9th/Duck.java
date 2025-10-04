import java.util.Scanner;

public class Duck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c = n;
        boolean f = true;
        int i = 1;
        while (c!=0) {
            int d=c%10;
            if (d==0) {
                f=false;
                break;
            }
            c=c/10;
            i++;
        }
        System.out.println(f==false?"Duck number":"Not a Duck number");
        System.out.println(i);
        scanner.close();
    }
}
