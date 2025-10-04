import java.util.*;
public class Series2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int a = 1, i = 1;
        while(i != n) {
            System.out.println(a);
            a=a*10+1;
            i++;
        }
        scanner.close();
    }
}
