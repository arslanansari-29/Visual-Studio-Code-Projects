import java.util.Scanner;

public class Series7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter of terms");
        int a = 1;
        for(int i = 1; i<=a; i++)   {
            System.out.println(a);
            a=a+i*i;
        }
        scanner.close();
    }
}
