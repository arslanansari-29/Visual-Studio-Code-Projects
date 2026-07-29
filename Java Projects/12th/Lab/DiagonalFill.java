import java.util.*;

public class DiagonalFill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int num = 1;
        for(int i = 0; i < n; i++)
            a[i][i] = num++;
        for(int d = 1; d < n; d++)
        {
            for(int i = 0, j = d; j < n; i++, j++)
                a[i][j] = num++;
            for(int i = d, j = 0; i < n; i++, j++)
                a[i][j] = num++;
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        sc.close();
    }
}