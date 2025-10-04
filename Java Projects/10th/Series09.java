import java.util.*;
public class Series09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=scanner.nextInt(),a=0,b=1,c=1;
        for(int i=1; i<=n; i++){
            System.out.print(a+", ");
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        scanner.close();
    }
}