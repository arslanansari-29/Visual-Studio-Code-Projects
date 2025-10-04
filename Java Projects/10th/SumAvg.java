import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: "); 
        int n = scanner.nextInt(),s=0;
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("Enter a value: ");
            ar[i] = scanner.nextInt();
            s+=ar[i];
        }
        System.out.print("Sum: "+s+"\nAverage: "+s/n);
        scanner.close();
    }
}
