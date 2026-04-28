import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: M = ");
        int M = sc.nextInt();
        System.out.print("N = ");
        int N = sc.nextInt();
        if((M <= 2 || M >= 10) || (N <= 2 || N >= 10)) {
            System.out.print("SIZE IS OUT OF RANGE. INVALID ENTRY.");
            sc.close();
            return;
        }
        System.out.println("OUTPUT: Enter elements in the matrix: ");
        int[][] A = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                int t=A[M-(i+1)][j];
                A[M-(i+1)][j] = A[0][j];
                A[0][j] = t;
            }
        }
        int h=A[0][0], r=0, c=0;
        System.out.println("FORMED MATRIX AFTER ROTATING: ");
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(A[i][j] > h) {
                    h = A[i][j];
                    r = i;
                    c = j;
                }
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Highest element: " + h + " (Row: " + r + " and Column: " + c + ")");
        sc.close();
    }
}
