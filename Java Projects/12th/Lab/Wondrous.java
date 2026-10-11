import java.util.Scanner;
public class Wondrous {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT:");
        System.out.print("N = ");
        int N = scanner.nextInt();
        if(N < 2 || N > 10) 
        {
            System.out.println("OUTPUT:\nINVALID INPUT");
            scanner.close(); return;
        }
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
            {
                A[i][j] = scanner.nextInt();
                while (A[i][j] < 1 || A[i][j] > N * N) 
                {
                    System.out.println("Invalid input, please re-enter at same position.");
                    A[i][j] = scanner.nextInt();
                }
            }
        int sum = N * (N * N + 1) / 2;
        boolean f = true;
        for (int i = 0; i < N; i++) 
        {
            int rSum = 0, cSum = 0;
            for (int j = 0; j < N; j++) 
            {
                rSum += A[i][j];
                cSum += A[j][i];
            }
            if (rSum != sum || cSum != sum) 
            {
                f = false;
                break;
            }
        }
        System.out.println("OUTPUT:");
        System.out.println(f ? "YES IT REPRESENTS A WONDROUS SQUARE." : "NOT A WONDROUS SQUARE.");
        System.out.println("PRIME\tROW INDEX\tCOLUMN INDEX");
        for (int k = 1; k <= N * N; k++) 
        {
            boolean isPrime = k > 1;
            for (int p = 2; p * p <= k; p++) 
                if (k % p == 0) 
                {
                    isPrime = false;
                    break;
                }
            if (isPrime)
                for (int i = 0; i < N; i++) 
                    for (int j = 0; j < N; j++) 
                    {
                        if (A[i][j] == k) 
                            System.out.println(k + "\t" + i + "\t\t" + j);
                        else
                            break;
                    }
        } scanner.close();
    }
}