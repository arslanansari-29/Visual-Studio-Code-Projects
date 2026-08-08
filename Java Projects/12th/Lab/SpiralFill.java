import java.util.Scanner;

public class SpiralFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:\n1 - Clockwise\n2 - Anticlockwise");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        System.out.print("Enter N (2-10): ");
        int n = sc.nextInt();
        if (n < 2 || n > 10) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }
        int[][] mat = new int[n][n];
        if(choice == 1)
            fillClockwise(mat, n);
        else
            fillAnticlockwise(mat, n);
        printMatrix(mat, n);
        sc.close(); 
    }

    private static void fillClockwise(int[][] mat, int n) {
        int val = 1, r = 0, c = 0, dir = 0;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        while (val <= n * n) {
            mat[r][c] = val++;
            int nr = r + dr[dir], nc = c + dc[dir];
            if (nr < 0 || nr >= n || nc < 0 || nc >= n || mat[nr][nc] != 0) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }
            r = nr;
            c = nc;
        }
    }

    private static void fillAnticlockwise(int[][] mat, int n) {
        int val = 1, r = 0, c = 0, dir = 0;
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};
        while (val <= n * n) {
            mat[r][c] = val++;
            int nr = r + dr[dir], nc = c + dc[dir];
            if (nr < 0 || nr >= n || nc < 0 || nc >= n || mat[nr][nc] != 0) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }
            r = nr;
            c = nc;
        }
    }

    private static void printMatrix(int[][] mat, int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}