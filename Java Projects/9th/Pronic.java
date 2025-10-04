import java.util.*;
public class Pronic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        boolean f = true;
        for (int i=1; i<=n; i++) {
            if (n%i==0 && n%(i+1)==0 && i*(i+1)==n) {
                f=false;
                break;
            }
        }
        System.out.println(f==false?"Pronic number":"Not a Pronic number");
        System.out.println(f);
        scanner.close();
    }
}
