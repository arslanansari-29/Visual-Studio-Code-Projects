import java.util.Scanner;

public class Transpose {
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
            for(int j=0; j<ar.length; j++) {
                if(i<j) {
                    int t=ar[i][j];
                    ar[i][j]=ar[j][i];
                    ar[j][i]=t;
                }
            }
        }
        System.out.println("Transposed Array: ");
        for(int i=0; i<ar.length; i++) {
            for(int j=0; j<ar.length; j++) {
                System.out.print(ar[i][j] + ", ");
            }
            System.out.println();
        }
        sc.close();    
    }
}
