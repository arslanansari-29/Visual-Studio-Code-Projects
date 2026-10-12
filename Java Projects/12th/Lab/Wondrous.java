import java.util.Scanner;
public class Wondrous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT:");
        System.out.print("N = ");
        int N = sc.nextInt();
        if (N < 2 || N > 10) {
            System.out.println("OUTPUT:\nINVALID INPUT");
            sc.close(); return;
        }
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
                while (A[i][j] < 1 || A[i][j] > N * N) {
                    System.out.println("Invalid input, please re-enter at same position.");
                    A[i][j] = sc.nextInt();
                }
            }
        boolean f = true;
        boolean[] dup = new boolean[N * N + 1];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if (dup[A[i][j]]) 
                    f = false;
                dup[A[i][j]] = true;
            }
        int s = N * (N * N + 1) / 2;
        for (int i = 0; i < N && f; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < N; j++) {
                r += A[i][j];
                c += A[j][i];
            }
            if (r != s || c != s) 
                f = false;
        }
        System.out.println("OUTPUT:");
        System.out.println(f ? "YES IT REPRESENTS A WONDROUS SQUARE." : "NOT A WONDROUS SQUARE.");
        System.out.println("PRIME\tROW INDEX\tCOLUMN INDEX");
        for (int k = 2; k <= N * N; k++) {
            boolean p = true;
            for (int d = 2; d <= k / 2; d++)
                if (k % d == 0) 
                    p = false;
            boolean found = false;
            if (p)
                for (int i = 0; i < N && !found; i++)
                    for (int j = 0; j < N && !found; j++)
                        if (A[i][j] == k) {
                            System.out.println(k + "\t" + i + "\t\t" + j);
                            found = true;
                        }
        } sc.close();
    }
}