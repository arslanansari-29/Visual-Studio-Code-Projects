import java.util.Random;
import java.util.Scanner;

public class UniqueMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("INPUT: N = ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("ORIGINAL MATRIX: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = random.nextInt(1, 51);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
