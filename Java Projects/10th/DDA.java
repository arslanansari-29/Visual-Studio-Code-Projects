import java.util.Scanner;
public class DDA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int N=scanner.nextInt();
        int[][] ar=new int[N][N];
        for(int i=0; i<ar.length; i++) {
            for(int j=0; j<ar[i].length; j++) {
                System.out.print("Enter a value: ");
                ar[i][j]=scanner.nextInt();
            }
        }
        int corner = ar[0][0]+ar[0][N-1]+ar[N-1][N-1]+ar[N-1][0];
        int b=0,left=0,right=0;

        for(int i=0; i<ar.length; i++) {
            for(int j=0; j<ar[i].length; j++) {
                if(i==0||j==0||i==N-1||j==N-1)
                    b+=ar[i][j];
                if(i==j)
                    left+=ar[i][j];
                if(i+j==N-1)
                    right+=ar[i][j];
            }
        }
        System.out.println("Sum of boundary = " + b);
        System.out.println("Sum of left diagonal = " + left);
        System.out.println("Sum of right diagonal = " + right);
        System.out.println("Sum of corner = " + corner);
        for(int i=0; i<ar.length; i++) {
            int r=0;
            for(int j=0; j<ar[i].length; j++) {
                r=r+ar[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row = "+r);
        }
        for(int j=0; j<ar[0].length; j++) {
            int c=0;
            for(int i=0; i<ar.length; i++) {
                c=c+ar[i][j];
            }
            System.out.println("Sum of "+(j+1)+" column = "+c);
        }
        scanner.close();
    }
}
