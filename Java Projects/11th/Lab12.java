import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT:"+"\n"+"M =  ");
        int M = sc.nextInt();
        if(M<=3 || M>=10) {

            System.out.print("THE MATRIX SIZE IS OUT OF RANGE.");
            System.exit(0);
        }
        else {
            // Input Elements in Matrix
            int[][] A = new int[M][M];
            for(int i=0; i<M; i++) {
                for(int j=0; j<M; j++) {
                    A[i][j] = sc.nextInt();
                    if(A[i][j]<0) {
                        System.out.print("Negative Integer Entered.");
                        System.exit(0);
                    }
                }
            }

            // Print Elements in Matrix
            System.out.println("OUTPUT:");
            for(int i=0; i<M; i++) {
                for(int j=0; j<M; j++) {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
