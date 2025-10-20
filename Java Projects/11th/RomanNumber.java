import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 1 || n > 3000) {
            System.out.println("OUT OF RANGE.");
            System.exit(0);
        }
        else {
            String R = "";
            int[] A = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] B = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            for (int i = 0; i < A.length; i++) {
                while (n >= A[i]) {
                    R += B[i];
                    n -= A[i];
                }
            }
            System.out.println("Roman Number: " + R);
        }
        sc.close();
    }
}
