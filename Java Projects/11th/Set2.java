import java.util.Scanner;
class Set2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("M = ");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("N = ");
        int n = Integer.parseInt(in.nextLine());
        if(m < 3 || n < 3 || m > 19 || n > 19){
            System.out.println("SIZE OUT OF RANGE");
            System.exit(0);
        }
        int a[][] = new int[m][n];
        int b[] = new int[m * n];
        int index = 0;
        System.out.println("ENTER ELEMENTS OF THE MATRIX:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = Integer.parseInt(in.nextLine());
                b[index++] = a[i][j];
            }
        }
        System.out.println("ORIGINAL MATRIX");
        display(a);
        int max = a[0][0];
        int i1 = 0;
        int j1 = 0;
        int min = a[0][0];
        int i2 = 0;
        int j2 = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                    i1 = i;
                    j1 = j;
                }
                if(a[i][j] < min){
                    min = a[i][j];
                    i2 = i;
                    j2 = j;
                }
            }
        }
        System.out.println("LARGEST NUMBER: " + max);
        System.out.println("ROW = " + i1);
        System.out.println("COLUMN = " + j1);
        System.out.println("SMALLEST NUMBER: " + min);
        System.out.println("ROW = " + i2);
        System.out.println("COLUMN = " + j2);
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
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = b[index++];
            }
        }
        System.out.println("REARRANGED MATRIX");
        display(a);
        in.close();
    }
    public static void display(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}