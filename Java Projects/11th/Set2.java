import java.util.Random;
import java.util.Scanner;

public class Set2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: N = ");
        int n = sc.nextInt();
        Random random = new Random();
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
