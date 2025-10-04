import java.util.Scanner;

public class SumRowColumnSquare {
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
        System.out.println("Square Array: ");
        for(int i=0; i<ar.length; i++) {
            for(int j=0; j<ar.length; j++) {
                System.out.print(ar[i][j] + ", ");
            }
            System.out.println();
        }
        for(int i=0; i<ar.length; i++) {
            int r=0;
            int c=0;
            for(int j=0; j<ar.length; j++) {
                r+=ar[i][j];
                c+=ar[j][i];
            }
            System.out.println("Sum of row " + (i+1) + ": " + r);
            System.out.println("Sum of column " + (i+1) + ": " + c);
        }
        sc.close();
    }
}
