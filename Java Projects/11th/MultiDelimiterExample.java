import java.util.Scanner;

public class MultiDelimiterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = sc.nextLine();

        // Split by -, :, or |
        Scanner tokenScanner = new Scanner(input);
        tokenScanner.useDelimiter("[.?!]");

        while (tokenScanner.hasNext()) {
            System.out.println(tokenScanner.next());
        }

        sc.close();
        tokenScanner.close();
    }
}
