import java.util.Scanner;

public class Rotate270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        System.out.print("\tM = ");
        int M = sc.nextInt();
        System.out.print("\tN = ");
        int N = sc.nextInt();
        if((M < 2 || M >= 10) || (N < 2 || N >= 10)) {
            System.out.print("\tINVALID INPUT.");
            sc.close();
            return;
        }
        System.out.println("\tENTER ELEMENTS");
        int[][] A = new int[M][N];
        int[][] B = new int[N][M];
        for (int i = 0; i < M; i++) {
            System.out.print("\t");
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("\tORIGINAL MATRIX: ");
        display(A, M, N);
        System.out.println("ROTATED MATRIX (270 DEGREE)");
        int sum=0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                B[i][j] = A[M-(j+1)][i];
                if(B[i][j]%2!=0)
                    sum+=B[i][j];
            }
        }
        display(B, N, M);
        System.out.println("SUM OF ODD ELEMENTS: "+sum  );
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
