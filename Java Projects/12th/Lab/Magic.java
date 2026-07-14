import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INPUT: N = \t");
        int N = scanner.nextInt();
        if(N%2==0) {
            System.out.println("INVALID INPUT.");
            System.exit(0);
        }
        System.out.print("OUTPUT: \t");
        int[][] A = new int[N][N];
        int row = N/2;
        int col = N-1;
        for(int num = 1; num<=N*N; num++) {
            A[row][col] = num;
            int newRow = (row-1+N)%N;
            int newCol = (col+1)%N;
            if(A[newRow][newCol]!=0) {
                col = (col-1+N)%N;
            }
            else {
                row = newRow;
                col = newCol;
            }
        }
        for(int i = 0; i<N; i++) {
            if(i!=0)
                System.out.print("\t\t");
            for(int j = 0; j<N; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("SUM = " + (N*(N*N+1)/2));
        scanner.close();
    }
}