import java.util.Scanner;
class MatrixBoundary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT: ");
        System.out.print("N = ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("OUTPUT: ");
        if(n < 4 || n > 9){
            System.out.println("SIZE OUT OF RANGE");
            System.exit(0);
        }
        int m[][] = new int[n][n];
        int b[] = new int[n * n - (n - 2) * (n - 2)];
        int index = 0;
        int p = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                m[i][j] = Integer.parseInt(sc.nextLine());
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    b[index++] = m[i][j];
                else
                    p *= m[i][j];
            }
        }
        System.out.println("ORIGINAL MATRIX");
        display(m);
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b.length - 1 - i; j++){
                if(b[j] > b[j + 1]){
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        index = 0;
        for(int j = 0; j < n; j++)
            m[0][j] = b[index++];
        for(int i = 1; i < n; i++)
            m[i][n - 1] = b[index++];
        for(int j = n - 2; j >= 0; j--)
            m[n - 1][j] = b[index++];
        for(int i = n - 2; i > 0; i--)
            m[i][0] = b[index++];
        System.out.println("REARRANGED MATRIX");
        display(m);
        System.out.println("NON-BOUNDARY ELEMENTS");
        for(int i = 1; i < n - 1; i++){
            for(int j = 1; j < n - 1; j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("PRODUCT OF THE NON-BOUNDARY ELEMENTS = " + p);
        sc.close();
    }
    public static void display(int a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}