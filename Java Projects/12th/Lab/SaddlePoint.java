import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT : N = ");
        int N= sc.nextInt();
        int[][] arr = new int[N][N];
        System.out.print("MATRIX A[][] = ");
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        boolean flag = false;
        for(int i =0; i<N && )
    }
}
