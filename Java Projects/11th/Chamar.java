import java.util.Scanner;

public class Chamar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        if(n<1 || n>10)
        {
            System.out.print("Size out of range.");
            System.exit(0);
        }
        System.out.print("Enter first character: ");
        char ch1=sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2=sc.next().charAt(0);
        System.out.print("Enter third character: ");
        char ch3=sc.next().charAt(0);
        if(ch1==ch2 || ch2==ch3 || ch1==ch3)
        {
            System.out.println("Characters are same. Enter different characters.");
            System.exit(0);
        }
        char[][] ar = new char[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j || i+j==n-1)
                    ar[i][j]=ch1;
                else if(i==0 || i==n-1)
                    ar[i][j]=ch3;
                else if(j==0 || j==n-1)
                    ar[i][j]=ch2;
                else
                    ar[i][j]=ch3;
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
