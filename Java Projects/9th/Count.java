import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n, k=0;
        while (c!=0) {
            c=c/10;
            k++;
        }
        System.out.println(k);
        scanner.close();
    }
}
