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
        for(int i=0; i<N && !flag; i++) {
            int min = arr[i][0];
            int colIndex = 0;
            for(int j=1; j<N; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    colIndex = j;
                }
            }
            boolean isSaddlePoint = true;
            for(int k=0; k<N; k++) {
                if(arr[k][colIndex] > min) {
                    isSaddlePoint = false;
                    break;
                }
            }
            if(isSaddlePoint) {
                System.out.println("SADDLE POINT = " + min);
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("NO SADDLE POINT.");
        }
        // Sort the princiapl diagonal in ascending order using insertion sort
        for(int i=1; i<N; i++) {
            int key = arr[i][i];
            int j = i-1;
            while(j>=0 && arr[j][j] > key) {
                arr[j+1][j+1] = arr[j][j];
                j--;
            }
            arr[j+1][j+1] = key;
        }
        System.out.println("MATRIX AFTER SORTING PRINCIPAL DIAGONAL: ");
        for(int i = 0; i < N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        sc.close();
    }
}
