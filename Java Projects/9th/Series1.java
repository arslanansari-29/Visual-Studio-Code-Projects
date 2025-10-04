import java.util.*;
public class Series1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter a number");
        int n=scanner.nextInt();
        int a=0;
        for(int i=1; i<=n; i++) {
            a=a+i;
            System.out.println(a);
        }
        scanner.close();
    }
}
