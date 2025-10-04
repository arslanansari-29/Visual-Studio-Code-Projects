import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        System.out.println(n%7==0||n%10==7?"Buzz number":"Not a buzz number");
        scanner.close();
    }
}
