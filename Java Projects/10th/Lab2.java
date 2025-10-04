import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the pattern to print:");
        System.out.println("1. Pattern 1");
        System.out.println("2. Pattern 2");
        System.out.print("Enter your choice: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
            for (int i = 1; i <= 5; i++) {
                int num = i;    
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num+=5-j;
                }
                System.out.println();
            }
                break;
            case 2:
            for (int i = 1; i <= 5; i++) {
                int num = i;
                for (int j = 1; j <= 5; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        scanner.close();
    }
}
