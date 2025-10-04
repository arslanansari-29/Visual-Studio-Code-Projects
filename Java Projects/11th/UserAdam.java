import java.util.Scanner;

public class UserAdam {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range (min & max): ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        scanner.close();
    }
    
}
