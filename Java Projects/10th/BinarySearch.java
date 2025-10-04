import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n = scanner.nextInt();
        int[] ar=new int[n];
        for(int i=0; i<ar.length; i++) {
            System.out.print("Enter a value: ");
            ar[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int N=scanner.nextInt(), L=0, U=ar.length-1, M=0, p=-1;
        boolean f=false;
        while(L<=U) {
            M=(L+U)/2;
            if(N<ar[M])
                U=M-1;
            else if(N>ar[M])
                L=M+1; 
            else {
                f=true;
                p=M+1;
                break;
            }
        }
        System.out.print(f?"Number found: "+ar[M]+"\nPosition: "+p:"Number not found");
        scanner.close();
    }
}
