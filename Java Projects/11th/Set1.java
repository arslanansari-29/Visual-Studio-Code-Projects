import java.util.Scanner;
class Set1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = Integer.parseInt(in.nextLine());
        if(m < 3 || m > 9){
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
            System.exit(0);
        }
        int a[][] = new int[m][m];
        int left = 0;
        int right = 0;
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = Integer.parseInt(in.nextLine());
                if(i == j)
                    left += a[i][j];
                if(i + j == m - 1)
                    right += a[i][j];
            }
        }
        boolean isSymmetric = true;
        outer:
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] != a[j][i]){
                    isSymmetric = false;
                    break outer;
                }
            }
        }
        System.out.println("ORIGINAL MATRIX:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        if(isSymmetric)
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC.");
        else
            System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC.");
        System.out.println("The sum of the left diagonal = " + left);
        System.out.println("The sum of the right diagonal = " + right);
        in.close();
    }
}
