import java.util.*;
public class Lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int N = scanner.nextInt();
        switch (N) {
            case 1:
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                System.out.print("Enter a character: ");
                char ch = scanner.next().charAt(0);
                for(int i=1; i<=n; i++) {
                    for(int j=1; j<=n; j++)
                        System.out.print(ch+" ");
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
