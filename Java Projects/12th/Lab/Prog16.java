import java.util.*;

public class Prog16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.println("OUTPUT: ");
        int rows = (int)Math.pow(2, n);
        int table[][] = new int[rows][n];
        for(int j = 0; j < n; j++)
        {
            int value = j + 1;
            int block = (int)Math.pow(2, n - j - 1);
            int k = 0;
            boolean positive = true;
            while(k < rows)
            {
                for(int i = 0; i < block && k < rows; i++)
                {
                    table[k][j] = positive ? value : -value;
                    k++;
                }
                positive = !positive;
            }
        }
        int count = 0;
        for(int i = rows - 1; i >= 0; i--)
        {
            int sum = 0;
            for(int j = 0; j < n; j++)
                sum = sum + table[i][j];
            if(sum == 0)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(table[i][j] + "\t");
                System.out.println();
                count++;
            }
        }
        System.out.println("Total number of combinations = " + count);
        sc.close();
    }
}
