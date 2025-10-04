import java.util.Scanner;

public class DoublyMarkovMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N ");
        int N = sc.nextInt();
        if (N < 2 || N > 9) {
            System.out.println("SIZE IS OUT OF RANGE. INVALID ENTRY.");
            System.exit(0);
        }
        double[][] M = new double[N][N];
        System.out.print("Enter elements in the matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M[i][j] = sc.nextDouble();
                if (M[i][j] < 0) {
                    System.out.print("NEGATIVE NUMBER ENTERED. INVALID ENTRY.");
                    System.exit(0);
                }
            }
        }
        System.out.println("\nFORMATTED MATRIX:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(M[i][j]+"\t");
            System.out.println();
        }
        boolean isDoublyMarkov = true;
        for (int i = 0; i < N; i++) {
            double rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += M[i][j];     // Sum of row i
                colSum += M[j][i];     // Sum of column i
            }
            if (rowSum != 1.0 || colSum != 1.0) {
                isDoublyMarkov = false;
                break;
            }
        }
        // Step 7: Final output
        if (isDoublyMarkov) {
            System.out.println("IT IS A DOUBLY MARKOV MATRIX.");
        } else {
            System.out.println("IT IS NOT A DOUBLY MARKOV MATRIX.");
        }
        sc.close();
    }
}
