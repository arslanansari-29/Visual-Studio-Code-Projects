import java.util.Scanner;

public class Adam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        // Creating reverse of the number
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        // Squaring the reverse of the number
        int squareReverse = reverse * reverse;
        // Creating square of the reverse if the number
        int squareOfReverse = 0;
        temp = squareReverse;
        while (temp > 0) {
            int rem = temp % 10;
            squareOfReverse = squareOfReverse * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(squareOfReverse == n ? "Adam Number" : "Not Adam Number");
        scanner.close();
    }
}