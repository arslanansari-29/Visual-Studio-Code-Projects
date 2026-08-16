import java.util.*;
public class Suryansh16 {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println("OUTPUT: ");
        int pow = (int) Math.pow(2, n);
        int arr[][] = new int[pow][n];
        int p = -1; 
        int block = 1; 
        for (int i = 0; i < n; i++) {
            int seg = block; 
            for (int k = 0; k < pow; k++)
            { 
                arr[k][i] = p * (i + 1); 
                if ((k + 1) % seg == 0) 
                    p = -1 * p; 
            }
            block = 2 * block; 
            p = -1;
        }
        int s=0;int k=0;
        for (int i = 0; i < pow; i++) 
        {  
            s=0;
            for (int j = 0; j < n; j++)
                s=s+arr[i][j];
            if(s==0)
            {
                k++;
                for (int j = 0; j < n; j++)
                    System.out.print(arr[i][j]+"\t");
                System.out.println();
            }
        }
        System.out.print("Total number of combinations: "+k);
        sc.close();
    }
}