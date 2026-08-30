import java.util.Scanner;

public class TruthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT:\nN = : ");
        int n = sc.nextInt();
        System.out.println("OUTPUT: ");
        for(int i =0; i < n; i++) {
            char ch = (char)('A' + i);
            System.out.print(ch + " | ");
        }
        System.out.println();
        int rows = (int)Math.pow(2, n);
        for(int row =0; row < rows; row++) {
            for(int col = 0; col < n; col++) {
                int div = (int)Math.pow(2, n - col - 1);
                int value = (row / div) % 2;
                System.out.print(value + " | ");
            }
            System.out.println();
        }
        sc.close();
        // Implementation for truth table generation would go here
    }
}
