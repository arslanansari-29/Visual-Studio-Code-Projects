import java.util.Scanner;

public class Sunny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        double sqrt=Math.sqrt(n+1);
        System.out.println(sqrt==(int)sqrt?"Sunny number":"Not a Sunny number");
        scanner.close();
    }
}
