import java.util.Scanner;

public class BiggestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt(),p=0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter a value: ");
            arr[i] = scanner.nextInt();
        }
        int k=arr[0];
        for(int i=0; i<n; i++) {
            if(k<arr[i]) {
                k=arr[i];
                p=i+1;
            }
        }
        System.out.print("Biggest number: "+k+"\nPosition: "+p);
        scanner.close();
    }
}
