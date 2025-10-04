import java.util.Scanner;

public class Windsurf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Reverse the number
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        // Square the original and reversed numbers
        int squareOriginal = n * n;
        int squareReverse = reverse * reverse;

        // Reverse the square of the reversed number
        int reverseSquare = 0;
        temp = squareReverse;
        while (temp > 0) {
        int rem = temp % 10;
        reverseSquare = reverseSquare * 10 + rem;
        temp = temp / 10;
        }

        // Check if the reverse of the original number is equal to the square of the reversed number
        if (reverseSquare == squareOriginal) {
            System.out.println("Adam Number");
        } 
        else {
            System.out.println("Not Adam Number");
        }
        scanner.close();
    }
}
