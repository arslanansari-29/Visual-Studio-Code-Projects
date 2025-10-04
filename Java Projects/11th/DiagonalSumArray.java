import java.util.Scanner;

public class DiagonalSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size for square matrix: ");
        int n = sc.nextInt();
        int ar[][] = new int[n][n];
        for(int i=0; i<ar.length; i++) {
            for(int j=0; j<ar.length; j++) {
                System.out.print("Enter an element: ");
                ar[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<ar.length; i++) {
            for(int j=0; j<ar.length; j++) {
                if(i==j || i+j==n-1) {
                    sum += ar[i][j];
                }
            }
        }
        System.out.print("Sum of diagonal elements: " + sum);
        sc.close();
    }
}
