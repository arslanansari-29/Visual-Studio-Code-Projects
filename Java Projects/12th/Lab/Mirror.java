import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        System.out.print("\tM = ");
        int M = sc.nextInt();
        System.out.print("\tN = ");
        int N = sc.nextInt();
        int[][] A = new int[M][N];
        if((M <= 2 || M >= 10) || (N <= 2 || N >= 10)) {
            System.out.print("OUTPUT: INVALID INPUT.");
            sc.close();
            return;
        }
        System.out.print("\t");
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                A[i][j] = sc.nextInt();
            }
            System.out.print("\t");
        }
        System.out.println("OUTPUT: ORIGINAL MATRIX ");
        display(A, M, N);
        System.out.println("\tMIRROR MATRIX");
        for(int i=0; i<M; i++) {
            for(int j=0; j<N/2; j++) {
                int t = A[i][j];
                A[i][j] = A[i][N-(j+1)];
                A[i][N-(j+1)] = t;
            }
        }
        display(A, M, N);
        System.out.println("\tSUM OF THE CORNER ELEMENTS = "+(A[0][0]+A[0][N-1]+A[M-1][0]+A[M-1][N-1]));
        sc.close();
    }
    
    public static void display(int[][] A, int M, int N) {
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                System.out.print("\t"+A[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
